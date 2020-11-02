class RoadTaxCalculator{
	public static void main(String args[])
	{
		int vehiclePrice=80000;
		String state="KA";
		switch(state)
		{
			case "KA": 
				  float roadTaxKA=0.18f;
				  float finalTaxKA=vehiclePrice*roadTaxKA;
				  System.out.println("The tax to be paid  from KA is:" +finalTaxKA);
				  break;
			case "PB": 
				  float roadTaxPB=0.25f;
				  float finalTaxPB=vehiclePrice*roadTaxPB;
				  System.out.println("The tax to be paid is from PB is:" + finalTaxPB);
				  break;
			case "TS": 
				  float roadTaxTS=0.24f;
				  float finalTaxTS=vehiclePrice*roadTaxTS;
			          	  System.out.println("The tax to be paid is from TS is:" + finalTaxTS);
				  break;
			case "AP": 
				  float roadTaxAP=0.12f;
				  float finalTaxAP=vehiclePrice*roadTaxAP;
				  System.out.println("The tax to be paid is from AP is:" + finalTaxAP);
				  break;
			case "KL":    
				  float roadTaxKL=0.22f;
				  float finalTaxKL=vehiclePrice*roadTaxKL;
				  System.out.println("The tax to be paid is from KL is:" + finalTaxKL);
				  break;
			case "TN": 
				  float roadTaxTN=0.13f;
				  float finalTaxTN=vehiclePrice*roadTaxTN;
				  System.out.println("The tax to be paid is from TN is:" + finalTaxTN);
				  break;
			default : System.out.println("Select from KA,PB,TS,AP,KL,TN");
		}
	}
}