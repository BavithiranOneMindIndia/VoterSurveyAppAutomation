package stepdefs;

import java.util.List;

import org.openqa.selenium.WebDriver;

import actiondefs.CommonActionFlow;
import actiondefs.MainActionFlow;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition extends MainActionFlow {

	public WebDriver driver;

	List<String> getlistTextValueinGraphPage;
	List<String> getlistTextValueinMainLabel;
	String SearchedItem;
	String verifcationCodeValue;

	MainActionFlow MNF = new MainActionFlow();
	CommonActionFlow C = new CommonActionFlow();

	@Given("^Launch chrome Browser for votersurvey Website$")
	public void i_want_to_write_a_step_with_precondition() throws Exception {

		System.out.println("Launching Browser.............");
		MNF.Launch_Browser();

	}

	@Then("^Enter mobile number$")
	public void enter_mobile_number() {
		MNF.enterMobileNumber();
	}

	@Then("^Click next in mobileNumber Page$")
	public void next_in_mobile_number_Page() {
		MNF.mobilenumberCountinue();
	}

	@Then("Click countinue in 2nd Page")
	public void click_countinue_in_2ndPage() {
		MNF.Countine2nd();
	}

	@Then("^Enter Verification Code in Panel$")
	public void verificaiton_code() {

	}

	@Then("^Enter verificationCode$")
	public void enter_verificationCode() {
		MNF.enterVerificationCode();
	}

	@Then("^Click countinue for verificationCode$")
	public void click_countinue_for_verficationCode() {
		MNF.countinueForVerificationCode();
	}

	@Then("^Enter \"([^\"]*)\" value in search field$")
	public void Enter_a_Value_in_the_SearchField(String searchValueText) {
		SearchedItem = searchValueText;
		// MNF.searchingTextField(SearchedItem);
	}

	@Then("^Group any of the VoterList$")
	public void group_any_of_the_VoterList() throws InterruptedException {
		MNF.selectStreet();
		MNF.selectingVoterData();
		MNF.clickGroupingButton();
		MNF.selectingParty();
		MNF.clickcountineAfterSelectingParty();
		MNF.selectingReligion();
		MNF.save();

	}

	@Then("^Select any of the Street in the List$")
	public void select_any_of_the_Street_in_the_List() {
		MNF.getgroupedCount();
		MNF.selectStreet();
	}

	@Then("^Select any one of the Voter in the List$")
	public void select_any_one_of_the_Voter_in_the_List() {
		MNF.selectingVoterData();
	}

	@Then("^Click grouping button after selecting voter$")
	public void click_grouping_button_after_selecting_voter() {
		MNF.clickGroupingButton();
	}

	@Then("^Choose party for the selected voter$")
	public void choose_party_for_the_selected_voter() {
		MNF.selectingParty();
	}

	@Then("^Click countinue after choosing party for the voter$")
	public void click_countinue_after_choosing_party_for_the_voter() {
		MNF.clickcountineAfterSelectingParty();
	}

	@Then("^Choose religion for the selected voter$")
	public void choose_religion_for_the_selected_voter() {
		MNF.selectingReligion();
	}

	@Then("^Click save after selecting party and religion for the voter$")
	public void click_save_after_selecting_party_and_religion_for_the_selected_voter() throws InterruptedException {
		MNF.save();
	}

	@Then("^Assert grouped voter$")
	public void assert_grouped_Voter() {
		MNF.assertSelectedVoter();

	}

	@Then("^Click back button$")
	public void click_back_button() {
		MNF.clickBackButton();
	}

	@Then("^Get count of total grouped count after grouping$")
	public void get_count_of_total_Grouped_count_after_grouping() {
		MNF.assertCountAfterGrouping();
	}

	@Then("^Assert Count$")
	public void assert_count() {
		MNF.countAssertAfterGrouping();

	}

	@Then("^Click Report$")
	public void click_report() {
		MNF.reportButtonClick();
	}

	@Then("^Get number of parties listed in ReportPage$")
	public void get_number_of_parties_listed_in_reportPage() {
		MNF.toGetPartiesInReport();
	}

	@Then("^Click 13 parties in Loop$")
	public void click_13_parties_in_loop() {
		MNF.click13PartyInLoop();
	}

	@Then("^Quit from the Website$")
	public void Quit_From_theWebsite() {
		System.out.println("Quitting the Browser..........");
		MNF.QuitBrowser();
	}

}
