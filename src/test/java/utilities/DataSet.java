package utilities;

import org.testng.annotations.DataProvider;

import pages.LoginPage;
import pages.RegisterPage;

public class DataSet {
	
	@DataProvider(name = "invalidUserDataForRegister")
	 public static Object invalidCredentialsForRegister() {
		 
		 RegisterPage registerPage = new RegisterPage();
		 Object [][]data = {{"","","","","", "Keeping all mandatory field blank", registerPage.errorMessageField, registerPage.emailErrorMessage},
				 
				 {"tefa     bax","01970000000","tefabax410@laymro.com","12345678","12345678", "Entering more than one space in name field", registerPage.errorMessageField, registerPage.nameErrorMessage},
				 {"tefa,,,,,,bax","01970000000","tefabax42@laymro.com","12345678","12345678", "Entering commas between alphabets in name field", registerPage.errorMessageField, registerPage.nameErrorMessage},
				 {"##@@$$","01970000000","tefabax43@laymro.com","12345678","12345678", "Entering special charecters in name field", registerPage.errorMessageField, registerPage.nameErrorMessage},
				 {"12345","01970000000","tefabax44@laymro.com","12345678","12345678", "Entering numbers in name field", registerPage.errorMessageField, registerPage.nameErrorMessage},
				 {"#@$123","01970000000","tefabax45@laymro.com","12345678","12345678", "Entering numeric numbers and special characters in name field", registerPage.errorMessageField, registerPage.nameErrorMessage},
				 {"23.56","01970000000","tefabax46@laymro.com","12345678","12345678", "Entering decimnal numbers in name field", registerPage.errorMessageField, registerPage.nameErrorMessage},
				 {"","01970000000","tefabax47@laymro.com","12345678","12345678", "Keeping name field blank", registerPage.errorMessageField, registerPage.nameErrorMessage},
				 
				 {"tefabax","abcdefghijk","tefabax48@laymro.com","12345678","12345678", "Entering Alphabets in phone number field", registerPage.errorMessageField, registerPage.phoneNumberErrorMessage},
				 {"tefabax","@#$@#$@#$@#$","tefabax49@laymro.com","12345678","12345678", "Entering Special characters in phone number field", registerPage.errorMessageField, registerPage.phoneNumberErrorMessage},
				 {"tefabax","01000000000","tefabax50@laymro.com","12345678","12345678", "Entering invalid number in phone number field", registerPage.errorMessageField, registerPage.phoneNumberErrorMessage},
				 {"tefabax","019233200","tefabax51@laymro.com","12345678","12345678", "Entering less than 11 numbers in phone number field", registerPage.errorMessageField, registerPage.phoneNumberErrorMessage},
				 {"tefabax","","tefabax52@laymro.com","12345678","12345678", "Keeping phone number field blank", registerPage.errorMessageField, registerPage.phoneNumberErrorMessage},
				 
				 {"tefabax","01970000000","1234","12345678","12345678", "Entering only numbers in email field", registerPage.errorMessageField, registerPage.emailErrorMessage},
				 {"tefabax","01970000000","tefabax442@l","12345678","12345678", "Entering invalid email address", registerPage.errorMessageField, registerPage.emailErrorMessage},
				 {"tefabax","01970000000","","12345678","12345678", "Keeping email field blank", registerPage.errorMessageField, registerPage.emailErrorMessage},
				 
				 {"tefabax","01970000000","tefabax53@laymro.com","12","12345678", "Entering less than 6 characters in password field", registerPage.errorMessageField, registerPage.passwordErrorMessage},
				 {"tefabax","01970000000","tefabax54@laymro.com","","12345678", "Keeping password field blank", registerPage.errorMessageField, registerPage.passwordErrorMessage},
				 
				 {"tefabax","01970000000","tefabax55@laymro.com","12345678","87", "Entering different password in confirm password field", registerPage.errorMessageField, registerPage.confirmPassworderrorMessage},
				 {"tefabax","01970000000","tefabax56@laymro.com","12345678","", "Keeping confirm password field blank", registerPage.errorMessageField, registerPage.confirmPassworderrorMessage},
				 
				 {"tef,,,,,abax","0197000","tefabax57@laymro","12345","123", "Entering incorrect credentials", registerPage.errorMessageField, registerPage.confirmPassworderrorMessage},
				 {"tefabax","01970000000","tutt@gh.com","12345678","12345678", "Entering used email address", registerPage.errorMessageField, registerPage.alreadyUsedEmailErrorMessage},
				 
				 
		 };
	
		 return data;
	
	 }
	
	
	

	 @DataProvider(name = "invalidUserDataForLogin")
	 public static Object invalidCredentialsForLogin(){
		 
		LoginPage loginPage = new LoginPage();
        Object[][] data = {{"", "ad", loginPage.usernameEmptyErrorMessage},//LoginWithInvalidPassword
               {"tutt@gh.com", "", loginPage.passwordEmptyErrorMessage},//LoginWithInvalidEmail
               {"", "", loginPage.usernameEmptyErrorMessage},//LoginWithInvalidEmailPassword
               {"tghfh@gh.com","ad", loginPage.usernameincorrectErrorMessage},//LoginWithoutEmail
               {"tutt@gh.com", "123", loginPage.passwordIncorrectErrorMessage},//LoginWithoutPassword
               {"tghkl@gh.com", "321", loginPage.usernameincorrectErrorMessage}//LoginWithoutEmailPassword
           };

       return data;
   }

}
