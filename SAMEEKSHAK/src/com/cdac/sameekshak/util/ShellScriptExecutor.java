package com.cdac.sameekshak.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class ShellScriptExecutor {

	public static String finalOutput="";
	
    static class StreamGobbler extends Thread {
        InputStream is;

        String type;
       
        

        StreamGobbler(InputStream is, String type) {
                this.is = is;
                this.type = type;
        }

        public void run() {
                try {
                	
                		long currTime = System.currentTimeMillis();
                		long terminatingTime = currTime+2000;
                		InputStreamReader isr = new InputStreamReader(is);
                        BufferedReader br = new BufferedReader(isr);
                        String line = null;
                        while ((line = br.readLine()) != null){
                        	 String semiOutput = line;
                             System.out.println(type + ">" + line);
                             if ((long)System.currentTimeMillis() == terminatingTime){
                            	 finalOutput=" Evaluation time Exceeded : Plz Try again";
                            	 System.out.println("Infinite LOOP");
                            	 break;
                            	
                             }
                             finalOutput+=semiOutput+"\n";
//                             System.out.println("finalOutput = " + finalOutput + " khatam hua");
                        }
                } catch (IOException ioe) {
                	finalOutput=" Infinite LOOP";
                        ioe.printStackTrace();
                }
                catch (Exception e) {
					// TODO: handle exception
                	
                	System.out.println("some error in shell script executer...");
				}
        }
    }


    public static void Main(String[] args) {
    	
    	finalOutput="";
        if (args.length < 1) {
                System.out.println("USAGE: java ShellScriptExecutor script");
                System.exit(1);
        }

        try {
                String osName = System.getProperty("os.name");
                String[] cmd = new String[2];
                cmd[0] = "/bin/sh"; // should exist on all POSIX systems
                cmd[1] = args[0];

                Runtime rt = Runtime.getRuntime();
                System.out.println("Execing " + cmd[0] + " " + cmd[1] );
                Process proc = rt.exec(cmd);
                // any error message?
                StreamGobbler errorGobbler = new StreamGobbler(proc
                                .getErrorStream(), "ERROR");

                // any output?
                StreamGobbler outputGobbler = new StreamGobbler(proc
                                .getInputStream(), "OUTPUT");

                // kick them off
                errorGobbler.start();
                outputGobbler.start();

                // any error???
                int exitVal = proc.waitFor();
                System.out.println("ExitValue: " + exitVal);
        } catch (Throwable t) {
                t.printStackTrace();
        }
    }
}

