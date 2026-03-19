package com.digitaltherapy.cli.commands.settings;

import com.digitaltherapy.cli.Command;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class SettingsCommand implements Command {

    public String getName() { return "6"; }
    public String getMenuLabel() { return "Settings"; }
    
    public void execute (Scanner in) {
        System.out.println("Going to Settings...");
    }
}
