package com.dudebro.dudeboot.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import net.minecraft.block.Block;
import net.minecraft.world.World;

import com.dudebro.dudeboot.init.ModBlocks;

public class IODudeBoot {
	/*public void webChunkReader(World world, int chunkX, int chunkZ){
	 // Make a URL to the web page
    	URL url = new URL("https://dl.dropboxusercontent.com/u/20317367/A" + chunkX + "D" + chunkZ + ".txt");

    // Get the input stream through URL Connection
    	URLConnection con = url.openConnection();
    	InputStream is =con.getInputStream();

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
			world.setBlock(Integer.parseInt(blockline[0]), Integer.parseInt(blockline[1]), Integer.parseInt(blockline[2]), (Block) Block.blockRegistry.getObject(blockline[3]), 0, 2);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
}
