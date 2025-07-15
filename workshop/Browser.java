package workshop;
import java.util.*;
public class Browser {
    private Stack<String>forward;
    private Stack<String>backward;
    private String currentPage;

    public Browser(String url){
        forward=new Stack<>();
        backward=new Stack<>();
        currentPage=url;
    }


    public void visit(String url){
        backward.push(currentPage);
        currentPage=url;
        forward.clear();
        System.out.println("currentPage:" + " " + currentPage);
    }

    public void back(){
     if(!backward.isEmpty()){
      currentPage=backward.pop();
      forward.push(currentPage);
      System.out.println("previous page" + " " + currentPage);      
     }else{
        System.out.println("No previous Page");
     }
    }

    public void forward(){
        if(!forward.isEmpty()){
            currentPage=forward.pop();
            backward.push(currentPage);
            System.out.println("next page" + " " + currentPage);
        }else{
            System.out.println("No next page");
        }

    }
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        Browser browser = new Browser("www.google.com");
        browser.visit("www.facebook.com");
        browser.visit("www.twitter.com");
        browser.back();
        browser.forward();
     
    }
}
