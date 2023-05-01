package lesson6;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
    public String brand;
    public String series;
    public String diagonal;
    public String cpu;
    public String graphicscard;
    public String price;
    

    public Notebook(){
        this.brand = "Noname";
        this.series = "Noname";
        this.diagonal = "Noname";
        this.cpu = "Noname";
        this.graphicscard = "Noname";
        this.price = "Noname";
             
    }
    
    public Notebook(String brand, String series, String diagonal, String cpu, String graphicscard, String price) {
        this.brand = brand;
        this.series = series;
        this.diagonal = diagonal;
        this.cpu = cpu;
        this.graphicscard = graphicscard;
        this.price = price;
                
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Ноутбук "+ brand + ", " +series+", " +diagonal+", " +cpu+", " +graphicscard+ price +"\n";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Notebook model = (Notebook) obj;
        return model.brand.equals(this.brand) || model.series.equals(this.series) || model.diagonal.equals(this.diagonal) || model.cpu.equals(this.cpu) || model.graphicscard.equals(this.graphicscard) || model.price.equals(this.price);
    }   
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + ((series == null) ? 0 : series.hashCode());
        result = prime * result + ((diagonal == null) ? 0 : diagonal.hashCode());
        result = prime * result + ((cpu == null) ? 0 : cpu.hashCode());
        result = prime * result + ((graphicscard == null) ? 0 : graphicscard.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        return result;
    }
    public static List<String> propertiesForFilter(){
        List<String> list = new ArrayList<>();
        list.add("brand");
        list.add("series");
        list.add("diagonal");
        list.add("cpu");
        list.add("graphicscard");
        list.add("price");
        

        return list;

    }
}   
