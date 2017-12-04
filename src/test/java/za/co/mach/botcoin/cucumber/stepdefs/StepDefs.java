package za.co.mach.botcoin.cucumber.stepdefs;

import za.co.mach.botcoin.BotcoinApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = BotcoinApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
