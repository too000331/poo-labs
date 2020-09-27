package monitors;

public class Main {

    public static void main(String[] args) {
        Monitor monitor1= new Monitor("blue","1920x1080",563,329);

        monitor1.showMonitorProperties();
        monitor1.setColor("white");
        monitor1.setResolution("720x360");
        monitor1.setHeight(410);
        monitor1.setWidth(302);

        System.out.println("Updated properties: ");
        monitor1.showMonitorProperties();

        Monitor monitor2=new Monitor("purple","1440x720",845,302);

        compareMonit("width",monitor1,monitor2);
    }

    public static void compareMonit(String parameter, Monitor monitor1, Monitor monitor2){
        switch(parameter){
            case "color":
                if(monitor1.color.equals(monitor2.color)){
                    System.out.println("They have the same color");
                }
                else{
                    System.out.println("They have different colors");
                }
                break;
            case "resolution":
                if(monitor1.resolution.equals(monitor2.resolution)){
                    System.out.println("They have the same resolution");
                }
                else{
                    System.out.println("They have different resolutions");
                }
                break;
            case "height":
                if(monitor1.height>monitor2.height){
                    System.out.println("Monitor 1 is higher");
                }
                else if(monitor1.height<monitor2.height){
                    System.out.println("Monitor 2 is higher");
                }
                else{
                    System.out.println("They are the same height");
                }
                break;
            case "width":
                if(monitor1.width>monitor2.width){
                    System.out.println("Monitor 1 is wider");
                }
                else if(monitor1.width<monitor2.width){
                    System.out.println("Monitor 2 is wider");
                }
                else{
                    System.out.println("They are the same width");
                }
                break;

            default:
                System.out.println("No such property!");
                break;
        }
    }
}
