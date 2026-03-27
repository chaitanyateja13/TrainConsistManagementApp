Set<String> bogieIds = new HashSet<>();

bogieIds.add("B1");
bogieIds.add("B2");
bogieIds.add("B1"); // duplicate

System.out.println("Unique Bogie IDs: " + bogieIds);