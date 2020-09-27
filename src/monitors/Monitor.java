package monitors;

public class Monitor {
    String color;
    String resolution;
    int height;
    int width;

    public Monitor(String monitorColor, String monitorResolution, int monitorHeight, int monitorWidth){
        color=monitorColor;
        resolution=monitorResolution;
        height=monitorHeight;
        width=monitorWidth;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setResolution(String resolution){
        this.resolution=resolution;
    }
    public void setHeight(int height){
        this.height=height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void showMonitorProperties(){
        System.out.println("Color: "+color+ "\nResolution: "+resolution+"\nheight: "+height+"\nwidth: "+width);
    }
}
