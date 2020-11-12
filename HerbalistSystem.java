/*Info 2413 Group Project: Option 1 "The Herbalist System"
 *
 (input our student info on final submission. For our safety purposes dont put it in your code online)
 * 
 * Last Updated: 11/8/2020 */

package theHerbalistSystem;

import java.util.*;
import java.text.*;

public class HerbalistSystem {

	
	//hebalist functions
	private String herbName = null; //herb name = null
	private String herbDesc = null;  //herb description = null
	private String herbUse = null; //herb medical use = null
	private String herbFormula = null; //herb formula = null
	//private image for  herb //herb image = null
	
	//search functions
	private String searchFunction = null;
	
	//methods //default constructors
	//public Herbalist System
	/**
	 * @param username
	 * @param password
	 * @param email
	 * 
	 * @param herbName
	 * @param herbDesc
	 * @param herbUse
	 * @param herbFormula
	 *
	 */
	HerbalistSystem(){}
	public HerbalistSystem(String username, String password, String email, String herbName, String herbDesc, String herbUse, String herbFormula, String searchFunction){
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.herbName = herbName;
		this.herbDesc = herbDesc;
		this.herbUse = herbUse;
		this.herbFormula = herbFormula;
		this.searchFunction = searchFunction;
	}
	
	
	
	//get herbName & set herbName
	public String getHerbName() {
		return herbName;
	}
	public void setHerbName(String herbName) {
		this.herbName = herbName;
	}
	
	//get herbDesc & set herbDesc
	public String getHerbDesc() {
		return herbDesc;
	}
	public void setHerbDesc(String herbDesc) {
		this.herbDesc = herbDesc;
	}
	
	//get herbUse & set herbUse
	public String getHerbUse() {
		return herbUse;
	}
	public void setHerbUse(String herbUse) {
		this.herbUse = herbUse;
	}
	
	//get herbFormula & set herbFormula
	public String getHerbFormula() {
		return herbFormula;
	}
	public void setHerbFormula(String herbFormula) {
		this.herbFormula = herbFormula;
	}
	
	//get searchFunction & set searchFunction
	public String getSearchFunction () {
		return searchFunction;
	}
	public void setSearchFormula (String searchFunction) {
		this.searchFunction = searchFunction;
	}
}
