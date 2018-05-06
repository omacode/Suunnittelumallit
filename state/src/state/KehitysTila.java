package state;

public abstract class KehitysTila {

    void liiku() {
    }

    void syo() {
    }

    void nuku() {
    }

    void kehity(CharmanderHahmo c) {
    }

    void vaihdaTilaa(CharmanderHahmo c, KehitysTila k) {
        c.vaihdaTilaa(k);
    }

}
