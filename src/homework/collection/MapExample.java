package homework.collection;

import java.util.*;


public class MapExample {


    private static List<FootballTeamMember> footballPlayer = new ArrayList<>();

    public static void main(String[] args) {
        footballPlayer.add(new FootballTeamMember(10, "Zidane"));
        footballPlayer.add(new FootballTeamMember(77, "Mkhitaryan"));
        footballPlayer.add(new FootballTeamMember(6, "Carlos"));
        footballPlayer.add(new FootballTeamMember(9, "Ronaldo"));
        footballPlayer.add(new FootballTeamMember(17, "Ronaldo"));
        footballPlayer.add(new FootballTeamMember(7, "Raul"));
        System.out.println(createFootballTeam(footballPlayer));
        Map<Integer, String> memberMap = new HashMap<>();
        memberMap.put(10, "Messi");
        memberMap.put(12, "Marcelo");
        memberMap.put(4, "Ramos");
        memberMap.put(9, "Benzema");
        System.out.println(removeFromMap(memberMap, 12));
        printAllMemberNames();
        printAllMembers(footballPlayer);


    }


    //Ունենք FootballTeamMember-ի լիստ, պետք է ստանանք HashMap որտեղ կեյ-ը կլինի խաղացողի համարը, իսկ վելյուն իրա անունը։

    static Map<Integer, String> createFootballTeam(List<FootballTeamMember> members) {
        Map<Integer, String> playersMap = new HashMap<>();
        for (FootballTeamMember member : members) {
            playersMap.put(member.getNumber(), member.getName());
            if (playersMap.size() == members.size()) {
                return playersMap;
            }
        }
        return null;
    }

    //Մեթոդի մեջ պետք է տրված մապ-ից ջնջենք removedNumber համարը եթե կա, ու վերադարձնենք true, եթե չկա վերադարձնենք false
    static boolean removeFromMap(Map<Integer, String> memberMap, Integer removedNumber) {
        for (Integer integer : memberMap.keySet()) {
            if (integer.equals(removedNumber)) {
                memberMap.remove(integer);
                return true;
            }
        }
        return false;
    }


    //Մեթոդով տպելու ենք միայն անունները

    static void printAllMemberNames() {
        System.out.println("All member names");
        for (FootballTeamMember member : footballPlayer) {
            System.out.println(member.getName());
        }
    }


    //Մեթոդով տպելու ենք թե համարը, թե խաղացողի անունը հետյալ ձև՝
    // 11 - Poxos Poxosyan
    // 12 - Petros Petrosyan
    static void printAllMembers(List<FootballTeamMember> memberMap) {
        for (FootballTeamMember player : footballPlayer) {
            System.out.println(player.getNumber() + " - " + player.getName());

        }
    }
}


class FootballTeamMember {
    private int number;
    private String name;

    public FootballTeamMember(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



