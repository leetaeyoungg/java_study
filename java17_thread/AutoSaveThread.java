package test.com;

public class AutoSaveThread extends Thread{

    @Override
    public void run() {
        boolean bool = true;
        while(bool){
            System.out.println("run().....");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
            }
            save();
        }
        System.out.println("stop run()...");//출력되지않는다.
    }

    private void save() {
        System.out.println("save()...");
    }
}
