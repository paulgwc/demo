package com.gwc.demo.learn.course;

public abstract class NetWorkCourse {

     protected final void createCourse(){
         this.postSource();
         this.postNote();
         this.liveVideo();
         this.createPPT();
         this.preResource();
         if(this.needHomeWork()){
             checkHomeWork();
         }
     }

     abstract void checkHomeWork();

     protected boolean needHomeWork(){
         return false;
     }

     final void postSource(){
         System.out.println("postSource");
     }
    final void postNote(){
        System.out.println("postNote");
    }
    final void liveVideo(){
        System.out.println("liveVideo");
    }
    final void createPPT(){
        System.out.println("createPPT");
    }
    final void preResource(){
        System.out.println("preResource");
    }
}
