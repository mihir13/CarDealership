	import java.io.*;

	
	public class Database implements Serializable {
		String NumPlate;
		String Model;
		String CarType;
		String Size;				
		String Colour;
		String Mileage;				
		String AccHis;
		String Trans;				
		int Price;
		String ArrDate ;				
		String SelDate ;
		
	    Database() {};   // default constructor
	    public Database(String NumPlate, String Model, String CarType, String Size, String Colour , String Mileage, String AccHis, String Trans, int Price, String ArrDate, String SelDate ) {
	        this.NumPlate = NumPlate;
	        this.Model= Model;
	        this.CarType = CarType;
	        this.Size = Size;
	        this.Colour = Colour;
	        this.Mileage = Mileage;
	        this.AccHis = AccHis;
	        this.Trans = Trans;
	        this.Price = Price;
	        this.ArrDate = ArrDate;
	        this.SelDate = SelDate;
	    }
	    public String getNumPlate() {
	    	return NumPlate;
	    }
	    public String getModel() {
	        return Model;
	    }

	    public String getCarType() {
	        return CarType;
	    }

	    public String getSize() {
	        return Size;
	    }

	    public String getColour() {
	        return Colour;
	    }

	    public String getMileage() {
	    	return Mileage;
	    }
	    public String getAccHis() {
	        return AccHis;
	    }  
	    
	    public String getTrans() {
	        return Trans;
	    }
	    
	    public int getPrice() {
	        return Price;
	    }
	    
	    public String getArrDate() {
	        return ArrDate;
	    }


	    public String getSelDate() {
	        return SelDate;
	    }
	    
	    // Setters
	    public String setNumPlate() {
	    	return NumPlate;
	    }
	    public String setModel() {
	        return Model;
	    }

	    public String setCarType() {
	        return CarType;
	    }

	    public String setSize() {
	        return Size;
	    }

	    public String setColour() {
	        return Colour;
	    }

	    public String setMileage() {
	    	return Mileage;
	    }
	    
	    public String setAccHis() {
	        return AccHis;
	    }  
	    
	    public String setTrans() {
	        return Trans;
	    }
	    
	    public int setPrice() {
	        return Price;
	    }
	    
	    public String setArrDate() {
	        return ArrDate;
	    }


	    public String setSelDate() {
	        return SelDate;
	    }
	    public String toString() {
			return NumPlate + "," + Model + "," +CarType+ "," +Size+ "," +Colour+ "," +Mileage+ "," +AccHis+ "," +Trans+ "," +Price+ "," +ArrDate+ "," +SelDate;
			
	    	
	    }
	    
	   
	}


