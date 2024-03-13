ArrayList<Integer> amountOfRecycling = new ArrayList<>();

        Pattern pattern = Pattern.compile("\\d+");

        for (String line : lines) {
            Matcher matcher = pattern.matcher(line);
            int crates = 0;
            while (matcher.find()) {
                crates = Integer.parseInt(matcher.group());
            }
            amountOfRecycling.add(crates);
        }

        return amountOfRecycling;
