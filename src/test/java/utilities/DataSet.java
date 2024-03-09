package utilities;

import org.testng.annotations.DataProvider;

import pages.LoginPage;
import pages.RegisterPage;

public class DataSet {
	
	@DataProvider(name = "invalidUserDataForRegister")
	 public static Object invalidCredentialsForRegister() {
		 
		 RegisterPage registerPage = new RegisterPage();
		 Object [][]data = {{"","","","","", "Keeping all mandatory field blank", registerPage.errorMessageField, registerPage.emailErrorMessage},
				 
				 {"","01923320029","tefabax442@laymro.com","12345678","12345678", "Entering more than one space", registerPage.errorMessageField, registerPage.nameErrorMessage},
				 {"","01923320029","tefabax442@laymro.com","12345678","12345678", "Entering commas between alphabets", registerPage.errorMessageField, registerPage.nameErrorMessage},
				 {"","01923320029","tefabax442@laymro.com","12345678","12345678", "Entering special charecters", registerPage.errorMessageField, registerPage.nameErrorMessage},
				 {"","01923320029","tefabax442@laymro.com","12345678","12345678", "Entering numbers", registerPage.errorMessageField, registerPage.nameErrorMessage},
				 {"","01923320029","tefabax442@laymro.com","12345678","12345678", "Entering numeric numbers and special characters", registerPage.errorMessageField, registerPage.nameErrorMessage},
				 {"","01923320029","tefabax442@laymro.com","12345678","12345678", "Entering decimnal numbers", registerPage.errorMessageField, registerPage.nameErrorMessage},
				 {"","01923320029","tefabax442@laymro.com","12345678","12345678", "Keeping name field blank", registerPage.errorMessageField, registerPage.nameErrorMessage},
				 
				 {"tefabax","","tefabax442@laymro.com","12345678","12345678", "Entering Alphabets", registerPage.errorMessageField, registerPage.phoneNumberErrorMessage},
				 {"tefabax","","tefabax442@laymro.com","12345678","12345678", "Entering Special characters", registerPage.errorMessageField, registerPage.phoneNumberErrorMessage},
				 {"tefabax","","tefabax442@laymro.com","12345678","12345678", "Entering invalid number", registerPage.errorMessageField, registerPage.phoneNumberErrorMessage},
				 {"tefabax","","tefabax442@laymro.com","12345678","12345678", "Entering less than 11 numbers", registerPage.errorMessageField, registerPage.phoneNumberErrorMessage},
				 {"tefabax","","tefabax442@laymro.com","12345678","12345678", "Keeping phone number field blank", registerPage.errorMessageField, registerPage.phoneNumberErrorMessage},
				 
				 {"tefabax","01923320029","","12345678","12345678", "Entering only numbers", registerPage.errorMessageField, registerPage.emailErrorMessage},
				 {"tefabax","01923320029","","12345678","12345678", "Entering invalid email address", registerPage.errorMessageField, registerPage.emailErrorMessage},
				 {"tefabax","01923320029","","12345678","12345678", "Keeping email field blank", registerPage.errorMessageField, registerPage.emailErrorMessage},
				 
				 {"tefabax","01923320029","tefabax442@laymro.com","","12345678", "Entering less than 6 characters", registerPage.errorMessageField, registerPage.passwordErrorMessage},
				 {"tefabax","01923320029","tefabax442@laymro.com","","12345678", "Keeping password field blank", registerPage.errorMessageField, registerPage.passwordErrorMessage},
				 
				 {"tefabax","01923320029","tefabax442@laymro.com","12345678","", "Entering different password", registerPage.errorMessageField, registerPage.confirmPassworderrorMessage},
				 {"tefabax","01923320029","tefabax442@laymro.com","12345678","", "Keeping confirm password field blank", registerPage.errorMessageField, registerPage.confirmPassworderrorMessage},
				 
				 {"tef,,,,,abax","0192332","tefabax442@laymro","12345","123", "Entering incorrect credentials", registerPage.errorMessageField, registerPage.confirmPassworderrorMessage},
				 {"tefabax","01923320029","tutt@gh.com","12345678","12345678", "Entering used email address", registerPage.errorMessageField, registerPage.alreadyUsedEmailErrorMessage},
				 
				 
		 };
	
		 return data;
	
	 }
	
	
	

	 @DataProvider(name = "invalidUserDataForLogin")
	 public static Object invalidCredentialsForLogin(){
		 
		LoginPage loginPage = new LoginPage();
        Object[][] data = {{"tutt@gh.com", "12", loginPage.passwordIncorrectErrorMessage},//LoginWithInvalidPassword
               {"tghfh@gh.com", "ad", loginPage.usernameincorrectErrorMessage},//LoginWithInvalidEmail
               {"tghfh@gh.com", "12", loginPage.usernameincorrectErrorMessage},//LoginWithInvalidEmailPassword
               {"","ad", loginPage.usernameEmptyErrorMessage},//LoginWithoutEmail
               {"tghfh@gh.com", "", loginPage.passwordEmptyErrorMessage},//LoginWithoutPassword
               {"", "", loginPage.usernameEmptyErrorMessage}//LoginWithoutEmailPassword
           };

       return data;
   }

}
