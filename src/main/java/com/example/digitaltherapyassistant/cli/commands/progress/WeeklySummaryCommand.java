package com.digitaltherapy.cli.commands.progress;

import java.util.Scanner;
import org.springframework.stereotype.Component;
import com.digitaltherapy.cli.Command;

@Component
public class WeeklySummaryCommand implements Command {
    public String getName() { return "a"; }
    public String getMenuLabel() { return "Weekly Summary"; }
    
    public void execute(Scanner in) {
        System.out.println("Showing Weekly Summary...");
    }
}