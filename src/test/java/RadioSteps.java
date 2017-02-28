import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.junit.Assert.assertTrue;


public class RadioSteps {

    private Radio radio;
    private Antenna antenna;

    @Given("a digital radio")
    public void givenADigitalRadio() {
        radio = new Radio();
    }

    @Given("an antenna")
    public void givenAnAntenna() {
        antenna = new Antenna();
    }

    @When("I turn on the radio")
    public void iTurnOnTheRadio() {
        radio.switchOnOff();
    }

    @When("I raise the antenna")
    public void iRaiseTheAntenna() {
        antenna.rise();
    }

    @Then("the radio should be turned on")
    public void theRadioShouldBeTurnedOn() {
        assertTrue(radio.isTurnedOn());
    }

    @Then("the antenna should be raised")
    public void theAntennaShouldBeRaised() {
        assertTrue(antenna.isRaised());
    }


}
