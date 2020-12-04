package com.clases;

public class BeneficiosCovid19 {
    //Debe ser el numero entero aleatorio puedes usar la funcion ramdom para esto
    private String id;
    private String nombre;
    private float valorSubsidio;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getValorSubsidio() {
        return Float.valueOf(valorSubsidio);
    }

    @Override
    public String toString() {
        return "BeneficiosCovid19{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", valorSubsidio=" + valorSubsidio +
                '}';
    }

    public void setValorSubsidio(Float valorSubsidio) {
        this.valorSubsidio = valorSubsidio.floatValue();
    }

    //Completar clase

    //Implementar un metodo que retorne el mejor beneficio comparando los valores de todos los beneficios
    public Float getMejorbeneficios(){
        return Float.valueOf(0);
    }
}
