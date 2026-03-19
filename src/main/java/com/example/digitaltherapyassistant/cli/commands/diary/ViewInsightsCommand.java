package com.digitaltherapy.cli.commands.diary;

import java.util.Scanner;
import org.springframework.stereotype.Component;
import com.digitaltherapy.cli.Command;

@Component
public class ViewInsightsCommand implements Command {
    public String getName() { return "c"; }
    public String getMenuLabel() { return "View Insights"; }
    
    public void execute(Scanner in) {
        System.out.println("Viewing Insights...");
    }
}