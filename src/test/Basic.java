package test;
import cjdom.*;

/**
 * A custom class.
 */
public class Basic {

public static void main(String args[])
{
    // Get current window
    Window win = Window.current();
    System.out.println("Called Window.current()");
    
    // Get current document
    HTMLDocument doc = HTMLDocument.current();
    System.out.println("Called window.getDocument()");
    
    // Set document background color
    doc.setColor("pink");
    System.out.println("Called document.setColor(pink)");
    
    // Create image element
    HTMLImageElement img = (HTMLImageElement)doc.createElement("img");
    img.setSrc("http://www.reportmill.com/images/CheerpJ.jpg");
    
    // Get HTMLBody element and add image
    HTMLBodyElement body = doc.getBody();
    body.appendChild(img);
    
    // Create canvas element
    HTMLCanvasElement canvas = (HTMLCanvasElement)doc.createElement("canvas");
    canvas.setSize(300, 300);
    
    // Add canvas to body
    body.appendChild(canvas);
    
    // Get RenderingContext and clear to white
    CanvasRenderingContext2D rc = (CanvasRenderingContext2D)canvas.getContext("2d");
    rc.setFillStyle("rgb(255,255,255)");
    rc.fillRect(0,0,canvas.getWidth(),canvas.getHeight());
    
    // Draw red rect
    rc.setFillStyle("rgb(255,0,0)");
    rc.fillRect(100,100,100,100);
    
    // Draw image
    rc.drawImage(img,125,125,50,50);
    
    // Add listener
    //body.addEventListener("mousedown", e -> mouseDown(e));

    // Exit
    System.out.println("Basic test done");
}

static void mouseDown(Object anEvent)
{
    System.out.println("MouseDown: " + anEvent);
}

}