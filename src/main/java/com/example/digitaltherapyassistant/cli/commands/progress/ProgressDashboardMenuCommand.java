package com.digitaltherapy.cli.commands.progress;

import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.digitaltherapy.cli.Command;
import com.digitaltherapy.cli.MenuHandler;
import com.digitaltherapy.cli.commands.BackCommand;

@Component
public class ProgressDashboardMenuCommand implements Command {
    private MenuHandler dashboardMenuHandler;

    public ProgressDashboardMenuCommand(
        WeeklySummaryCommand weeklySummaryCommand,
        MonthlyTrendsCommand monthlyTrendsCommand,
        AchievementsCommand achievementsCommand,
        BackCommand backCommand
    ){
        dashboardMenuHandler = new MenuHandler(
            List.of(
                weeklySummaryCommand, monthlyTrendsCommand,
                achievementsCommand, backCommand
            ));
    }

    public String getName() { return "4"; }
    public String getMenuLabel() { return "Progress Dashboard"; }
    
    public void execute(Scanner in) {
        dashboardMenuHandler.runMenu("Progress Menu", in);
    }
}
