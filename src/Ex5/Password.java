package Ex5;

import java.security.SecureRandom;

public class Password {
	
	private int longitud;
	private String contraseña = "";
	
	public Password() {
		this.longitud=8;
		this.contraseña=generarPassword();
	}
	
	public Password(int longitud) {
		if (longitud<1)
			this.longitud=8;
		else
			this.longitud=longitud;
		this.contraseña=generarPassword();
	}
	
	public boolean esFuerte() {
		int nums=0, mayus=0,minus=0;
		for (int i=0;i<this.contraseña.length();i++) {
			if(contraseña.charAt(i)>='A' && contraseña.charAt(i)<='Z')
				mayus++;
			else if(contraseña.charAt(i)>='a' && contraseña.charAt(i)<='z')
					minus++;
			else
				nums++;
		}
		if (nums>5 && mayus>2 && minus>1)
			return true;
		
		return false;
	}

	public String generarPassword() {
		
		// Rango ASCII – alfanumérico + caracteres especiales
	    final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	 
	    SecureRandom random = new SecureRandom();
	    StringBuilder sb = new StringBuilder();
	 
	    
	    for (int i = 0; i < this.longitud; i++){
	        int randomIndex = random.nextInt(chars.length());
	        sb.append(chars.charAt(randomIndex));
	    }
	    return sb.toString();
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}
	
	

}
