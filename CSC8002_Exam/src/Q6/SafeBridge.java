package Q6;

public class SafeBridge {
    private int red_counter = 0;
    private int blue_counter = 0;

    public synchronized void redEnter() throws InterruptedException {
        while (blue_counter > 0) {
            wait();
        }
        red_counter++;
        System.out.println("red-enter");
        notifyAll();
    }

    public synchronized void redExit() throws InterruptedException {
        while (red_counter == 0) {
            wait();
        }
        red_counter--;
        System.out.println("red-exit");
        notifyAll();
    }

    public synchronized void blueEnter() throws InterruptedException {
        while (red_counter > 0) {
            wait();
        }
        blue_counter++;
        System.out.println("blue-enter");
        notifyAll();
    }

    public synchronized void blueExit() throws InterruptedException {
        while (blue_counter == 0) {
            wait();
        }
        blue_counter--;
        System.out.println("blue-exit");
        notifyAll();
    }

    public static void main(String[] args) throws InterruptedException {
        SafeBridge safeBridge = new SafeBridge();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 100; i++) {
                        safeBridge.redEnter();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 100; i++) {
                        safeBridge.redExit();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t3 = new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 100; i++) {
                        safeBridge.blueEnter();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t4 = new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 100; i++) {
                        safeBridge.blueExit();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        Thread.sleep(10000);
    }

}
