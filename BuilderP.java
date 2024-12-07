public class BuilderP {

    public class Computer {
        private String CPU;
        private String RAM;
        private String storage;

        private Computer(Builder builder){
            this.CPU = builder.CPU;
            this.RAM= builder.RAM;
            this.storage=builder.storage;

        }

        @Override
        public String toString(){
            return "CPU = "+CPU+ " Ram = "+RAM+ " Store = "+storage;
        }

        public static class Builder {

            private String CPU;
            private String RAM;
            private String storage;

            public Builder setCPU(String CPU){
                this.CPU = CPU;
                return this;
            }
            public Builder setRAM(String RAM){
                this.RAM = RAM;
                return this;
            }
            public Builder setStorage(String storage){
                this.storage = storage;
                return this;
            }        
            public Computer build(BuilderP bp){
                return bp.new Computer(this);
            } 
        }  
        
    }

    public static void main(String[] args){
        Computer gamepc = new Computer.Builder()
                            .setCPU("GAmeCPU")
                            .setRAM("Ramgame")
                            .setStorage("Store")
                            .build(new BuilderP());

        System.out.println(gamepc);
    }
    
}
