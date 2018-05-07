package proxy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<ProxyImage> proxyImages = new ArrayList<>();

        proxyImages.add(new ProxyImage("Photo1"));
        proxyImages.add(new ProxyImage("Photo2"));
        proxyImages.add(new ProxyImage("Photo5"));

        proxyImages.forEach(p -> p.showData());

        System.out.println("");

        proxyImages.get(0).displayImage();
        proxyImages.get(1).displayImage();
    }

}
