package org.example.multithreading;

public class Volatile_Keyword{
        public static void main(String[] args) {
            SharedResource sharedResource = new SharedResource();
            new Thread(()->{
                System.out.println("Thread 1  started");
                try{
                    System.out.println("Thread 1 logic started");
                Thread.sleep(1000);
                System.out.println("Thread 1 Logic Completed");
                sharedResource.setFlag(true);
                System.out.println("Flag set by Thread 1 ");

                }catch (Exception e){
                    e.printStackTrace();
                }
            }).start();
            new Thread(()->{
                System.out.println("Thread 2 Started"+sharedResource.isFlag());
                while(!sharedResource.isFlag()){
                    //it will run until flag is true;
//                    System.out.println("when value update and run 2nd thread ");
                }
                System.out.println("Thread 2 completed "+sharedResource.isFlag());
            }).start();
        }

    }
