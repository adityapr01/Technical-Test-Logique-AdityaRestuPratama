
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String



def static "valueMaxGadai.registerAccount"(
    	String email	
     , 	String namaLengkap	
     , 	String noHp	
     , 	String password	
     , 	String confirmPassword	) {
    (new valueMaxGadai()).registerAccount(
        	email
         , 	namaLengkap
         , 	noHp
         , 	password
         , 	confirmPassword)
}


def static "valueMaxGadai.loginCredentials"(
    	String email	
     , 	String password	) {
    (new valueMaxGadai()).loginCredentials(
        	email
         , 	password)
}
