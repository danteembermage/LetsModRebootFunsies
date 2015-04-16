package com.dudebro.dudeboot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import net.minecraft.init.Blocks;
import net.minecraftforge.event.world.WorldEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldEventListener {
	@SubscribeEvent
	public void worldLoaded(WorldEvent.Load event){
	    event.world.setBlock(0, 20, 0, Blocks.cactus, 0, 2);
	    URL url = null;
		boolean successful = false;
		try {
			//url = new URL("https://dl.dropboxusercontent.com/u/20317367/A" + chunkX + "D" + chunkZ + ".txt");
			url = new URL("https://dl.dropboxusercontent.com/u/20317367/A-1D-1.txt");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			successful = false;
		}
		
		
		
	    // Get the input stream through URL Connection
	    	URLConnection con = null;
			
				try {
					con = url.openConnection();
					successful = true;
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					successful = false;
				}
		if(successful){
	    	InputStream is = null;
			try {
				
					//System.out.println(con.);
					is = con.getInputStream();
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

	    // Once you have the Input Stream, it's just plain old Java IO stuff.

	    // For this case, since you are interested in getting plain-text web page
	    // I'll use a reader and output the text content to System.out.

	    // For binary content, it's better to directly read the bytes from stream and write
	    // to the target file.


	    	BufferedReader br = new BufferedReader(new InputStreamReader(is));

	    	String line = null;

	    // read each line and write to System.out
	    	try {
				while ((line = br.readLine()) != null) {
				System.out.println(line);
				String[] blockline = line.split(";");
				//event.world.setBlock(Integer.parseInt(blockline[0]), Integer.parseInt(blockline[1]), Integer.parseInt(blockline[2]), (Block) Block.blockRegistry.getObject(blockline[3]), 0, 2);
				event.world.setBlock(Integer.parseInt(blockline[0]), Integer.parseInt(blockline[1]), Integer.parseInt(blockline[2]), GameRegistry.findBlock("minecraft",(blockline[3])), 0, 2);
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
