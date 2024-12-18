public class CommandP {
    public interface Command {
        void execute();    
    }

    public class Light {

        public void turnOn(){
            System.out.println("Turned on the light");
        }   

        public void turnOff(){
            System.out.println("Turn off light");
        }
    }

    public class TurnOffCommand implements Command {

        private Light light;

        public TurnOffCommand(Light light){
            this.light=light;
        }

        @Override
        public void execute() {
            light.turnOff();
        }   
    }

    public class TurnOnCommand implements Command {

        private Light light;

        public TurnOnCommand(Light light){
            this.light=light;
        }

        @Override
        public void execute() {
            light.turnOn();
        }    
    }

    public class Remote {

        private Command command;

        public void setCommand(Command command){
            this.command=command;
            command.execute();
        }    
    }

    public static void main(String[] args){
        Light LEDLight = new CommandP().new Light();

        Command tOff=new CommandP().new TurnOffCommand(LEDLight);
        Command tOn = new CommandP().new TurnOnCommand(LEDLight);

        Remote remote=new CommandP().new Remote();

        remote.setCommand(tOn);
        remote.setCommand(tOff);
    }




    
}
