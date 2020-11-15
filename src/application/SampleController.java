package application;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.ColorAdjust;

public class SampleController {

	@FXML ImageView Donald;
	@FXML ImageView Joe;
	@FXML ImageView Jessica;
	@FXML ImageView Dana;
	@FXML ImageView Clement;
	@FXML ImageView Chloe;
	@FXML ImageView Lucy;
	@FXML ImageView George;
	@FXML ImageView Isabelle;
	@FXML ImageView Tracey;
	@FXML ImageView Agata;
	@FXML ImageView Jan;
	@FXML ImageView Przemys³aw;
	@FXML ImageView Joanna;
	@FXML ImageView Hubert;
	@FXML Button LosujPostac;
	@FXML TextField textArea;
	@FXML Button back;
	@FXML Button wyg;
	
	
	@FXML public void Clicked( MouseEvent event) {  
		ColorAdjust colorAdjust = new ColorAdjust();
		 colorAdjust.setBrightness(-0.5);
		 ColorAdjust colorAdjust1 = new ColorAdjust();
		 colorAdjust1.setBrightness(1);
		 ColorAdjust colorAdjust2 = new ColorAdjust();
		 colorAdjust2.setBrightness(0);
		 
		 
		 if (event.getButton() == MouseButton.SECONDARY) {
			 if (Donald.effectProperty().equals(colorAdjust)) {
				 Donald.setEffect(colorAdjust2);
			 } 
			 else {
	            Donald.setEffect(colorAdjust);;}
	        }
		 else if(event.getButton() == MouseButton.PRIMARY) {
			 if (Donald.getEffect()==colorAdjust1) {
				 Donald.setEffect(colorAdjust2);
			 } 
			 else {
			 Donald.setEffect(colorAdjust1);
			 }
		}
	}


	@FXML public void ClickedJoe(MouseEvent event) {
		ColorAdjust colorAdjust = new ColorAdjust();
		 colorAdjust.setBrightness(-0.5);
		 ColorAdjust colorAdjust1 = new ColorAdjust();
		 colorAdjust1.setBrightness(1);
		 
		 if (event.getButton() == MouseButton.SECONDARY) {
	            Joe.setEffect(colorAdjust);;
	        }
		 else if(event.getButton() == MouseButton.PRIMARY) {
			Joe.setEffect(colorAdjust1);
		
		}
	}


	@FXML public void ClickedJessica(MouseEvent event) {
		ColorAdjust colorAdjust = new ColorAdjust();
		 colorAdjust.setBrightness(-0.5);
		 ColorAdjust colorAdjust1 = new ColorAdjust();
		 colorAdjust1.setBrightness(1);
		 
		 if (event.getButton() == MouseButton.SECONDARY) {
	            Jessica.setEffect(colorAdjust);;
	        }
		 else if(event.getButton() == MouseButton.PRIMARY) {
			 Jessica.setEffect(colorAdjust1);
		
		}
	}


	@FXML public void ClickedDana(MouseEvent event) {
		ColorAdjust colorAdjust = new ColorAdjust();
		 colorAdjust.setBrightness(-0.5);
		 ColorAdjust colorAdjust1 = new ColorAdjust();
		 colorAdjust1.setBrightness(1);
		 
		 if (event.getButton() == MouseButton.SECONDARY) {
	            Dana.setEffect(colorAdjust);;
	        }
		 else if(event.getButton() == MouseButton.PRIMARY) {
			 Dana.setEffect(colorAdjust1);
		
		}
	}


	@FXML public void ClickedClement(MouseEvent event) {
		ColorAdjust colorAdjust = new ColorAdjust();
		 colorAdjust.setBrightness(-0.5);
		 ColorAdjust colorAdjust1 = new ColorAdjust();
		 colorAdjust1.setBrightness(1);
		 
		 if (event.getButton() == MouseButton.SECONDARY) {
	           Clement.setEffect(colorAdjust);;
	        }
		 else if(event.getButton() == MouseButton.PRIMARY) {
			 Clement.setEffect(colorAdjust1);
		
		}
	}


	@FXML public void ClickedChloe(MouseEvent event) {
		ColorAdjust colorAdjust = new ColorAdjust();
		 colorAdjust.setBrightness(-0.5);
		 ColorAdjust colorAdjust1 = new ColorAdjust();
		 colorAdjust1.setBrightness(1);
		 
		 if (event.getButton() == MouseButton.SECONDARY) {
	            Chloe.setEffect(colorAdjust);;
	        }
		 else if(event.getButton() == MouseButton.PRIMARY) {
			 Chloe.setEffect(colorAdjust1);
		
		}
	}


	@FXML public void ClickedLucy(MouseEvent event) {
		ColorAdjust colorAdjust = new ColorAdjust();
		 colorAdjust.setBrightness(-0.5);
		 ColorAdjust colorAdjust1 = new ColorAdjust();
		 colorAdjust1.setBrightness(1);
		 
		 if (event.getButton() == MouseButton.SECONDARY) {
	            Lucy.setEffect(colorAdjust);;
	        }
		 else if(event.getButton() == MouseButton.PRIMARY) {
			Lucy.setEffect(colorAdjust1);
		
		}
	}


	@FXML public void ClickedGeorge(MouseEvent event) {
		ColorAdjust colorAdjust = new ColorAdjust();
		 colorAdjust.setBrightness(-0.5);
		 ColorAdjust colorAdjust1 = new ColorAdjust();
		 colorAdjust1.setBrightness(1);
		 
		 if (event.getButton() == MouseButton.SECONDARY) {
	          George.setEffect(colorAdjust);;
	        }
		 else if(event.getButton() == MouseButton.PRIMARY) {
			George.setEffect(colorAdjust1);
		
		}
	}


	@FXML public void ClickedIsabelle(MouseEvent event) {
		ColorAdjust colorAdjust = new ColorAdjust();
		 colorAdjust.setBrightness(-0.5);
		 ColorAdjust colorAdjust1 = new ColorAdjust();
		 colorAdjust1.setBrightness(1);
		 
		 if (event.getButton() == MouseButton.SECONDARY) {
	           Isabelle.setEffect(colorAdjust);;
	        }
		 else if(event.getButton() == MouseButton.PRIMARY) {
			 Isabelle.setEffect(colorAdjust1);
		
		}
	}


	@FXML public void ClickedTracey(MouseEvent event) {
		ColorAdjust colorAdjust = new ColorAdjust();
		 colorAdjust.setBrightness(-0.5);
		 ColorAdjust colorAdjust1 = new ColorAdjust();
		 colorAdjust1.setBrightness(1);
		 
		 if (event.getButton() == MouseButton.SECONDARY) {
	            Tracey.setEffect(colorAdjust);;
	        }
		 else if(event.getButton() == MouseButton.PRIMARY) {
			 Tracey.setEffect(colorAdjust1);
		
		}
	}


	@FXML public void ClickedAgata(MouseEvent event) {
		ColorAdjust colorAdjust = new ColorAdjust();
		 colorAdjust.setBrightness(-0.5);
		 ColorAdjust colorAdjust1 = new ColorAdjust();
		 colorAdjust1.setBrightness(1);
		 
		 if (event.getButton() == MouseButton.SECONDARY) {
	            Agata.setEffect(colorAdjust);;
	        }
		 else if(event.getButton() == MouseButton.PRIMARY) {
			Agata.setEffect(colorAdjust1);
		
		}
	}


	@FXML public void ClickedJan(MouseEvent event) {
		ColorAdjust colorAdjust = new ColorAdjust();
		 colorAdjust.setBrightness(-0.5);
		 ColorAdjust colorAdjust1 = new ColorAdjust();
		 colorAdjust1.setBrightness(1);
		 
		 if (event.getButton() == MouseButton.SECONDARY) {
	            Jan.setEffect(colorAdjust);;
	        }
		 else if(event.getButton() == MouseButton.PRIMARY) {
			 Jan.setEffect(colorAdjust1);
		
		}
	}


	@FXML public void ClickedPrzemys³aw(MouseEvent event) {
		ColorAdjust colorAdjust = new ColorAdjust();
		 colorAdjust.setBrightness(-0.5);
		 ColorAdjust colorAdjust1 = new ColorAdjust();
		 colorAdjust1.setBrightness(1);
		 
		 if (event.getButton() == MouseButton.SECONDARY) {
	            Przemys³aw.setEffect(colorAdjust);;
	        }
		 else if(event.getButton() == MouseButton.PRIMARY) {
			 Przemys³aw.setEffect(colorAdjust1);
		
		}
	}


	@FXML public void ClickedJoanna(MouseEvent event) {
		ColorAdjust colorAdjust = new ColorAdjust();
		 colorAdjust.setBrightness(-0.5);
		 ColorAdjust colorAdjust1 = new ColorAdjust();
		 colorAdjust1.setBrightness(1);
		 
		 if (event.getButton() == MouseButton.SECONDARY) {
	            Joanna.setEffect(colorAdjust);;
	        }
		 else if(event.getButton() == MouseButton.PRIMARY) {
			 Joanna.setEffect(colorAdjust1);
		
		}
	}


	@FXML public void ClickedHubert(MouseEvent event) {
		ColorAdjust colorAdjust = new ColorAdjust();
		 colorAdjust.setBrightness(-0.5);
		 ColorAdjust colorAdjust1 = new ColorAdjust();
		 colorAdjust1.setBrightness(1);
		 
		 if (event.getButton() == MouseButton.SECONDARY) {
	            Hubert.setEffect(colorAdjust);;
	        }
		 else if(event.getButton() == MouseButton.PRIMARY) {
			 Hubert.setEffect(colorAdjust1);
		
		}
	}


	@FXML public void Losuj(ActionEvent event) {
		String[] osoby = new String[15];
		osoby [0] = "Donald";
		osoby [1] = "Hubert";
		osoby [2] = "Joanna";
		osoby [3] = "Przemys³aw";
		osoby [4] = "Jan";
		osoby [5] = "Agata";
		osoby [6] = "Isabelle";
		osoby [7] = "Lucy";
		osoby [8] = "Chloe";
		osoby [9] = "Clement";
		osoby [10] = "Tracey";
		osoby [11] = "Joe";
		osoby [12] = "Dana";
		osoby [13] = "Jessica";
		osoby [14] = "George";
		int a=(int)Math.round(Math.random()*14);
		
		textArea.textProperty().set(osoby[a]);
	}


	@FXML public void Clear(ActionEvent event) {
		Donald.setEffect(null);
		Przemys³aw.setEffect(null);
		Dana.setEffect(null);
		Clement.setEffect(null);
		Tracey.setEffect(null);
		George.setEffect(null);
		Chloe.setEffect(null);
		Jessica.setEffect(null);
		Joe.setEffect(null);
		Isabelle.setEffect(null);
		Joanna.setEffect(null);
		Agata.setEffect(null);
		Jan.setEffect(null);
		Hubert.setEffect(null);
		Lucy.setEffect(null);
		
	}


	@FXML public void Win(ActionEvent event) {
		Donald.setEffect(null);
		Przemys³aw.setEffect(null);
		Dana.setEffect(null);
		Clement.setEffect(null);
		Tracey.setEffect(null);
		George.setEffect(null);
		Chloe.setEffect(null);
		Jessica.setEffect(null);
		Joe.setEffect(null);
		Isabelle.setEffect(null);
		Joanna.setEffect(null);
		Agata.setEffect(null);
		Jan.setEffect(null);
		Hubert.setEffect(null);
		Lucy.setEffect(null);
		
	}


	
	 

}
