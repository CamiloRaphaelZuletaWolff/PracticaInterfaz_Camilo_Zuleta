package org.thirdProblem;

public class Articulo implements Interactuable{



    @Override
    public void comentar(String comentario) {
        System.out.println(comentario);
    }

    @Override
    public void reaccionar(String tipoReaccion) {
        System.out.println(tipoReaccion);
    }

    @Override
    public void compartir() {
        System.out.println("Estas compartiendo este articulo!!");
    }
}
