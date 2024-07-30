package com.nianatic;

public class Exercises
{
    /*
     * In this function you need to convert a word
     * either to all upper case letters or all
     * lower case.
     *
     * The user will provide you with the word, and
     * which case you should change it to.
     *
     * changeCase("Fancy", false) => fancy
     * changeCase("chocolate", true) => CHOCOLATE
     * changeCase("PARTY", false) => party
     * changeCase("PARTY", true) => PARTY
     *
     */
    public String changeCase(String word, boolean toUpperCase)

    {
        String outputWord;

        //Check the given boolean and change case as necessary
        if (toUpperCase)
        {
            outputWord = word.toUpperCase();
        }
        else
        {
            outputWord = word.toLowerCase();
        }
        //Return the formatted output
        return outputWord;
    }

    /*
     * As a full stack developer you will often need to
     * dynamically create Html in code. In this function
     * you are required to take the input and convert it
     * to a valid Html String.
     *
     * Html is made up of elements (also known as tags)
     * such as:
     *
     * <p>your content here</p>
     *
     * The element is <p> for paragraph
     *
     * Most elements have both an opening <p>
     * and a closing </p> tag, and the content
     * goes inside.
     *
     * The user will provide you with the content, and
     * the name of Html element.
     *
     * You need to return the formatted Html
     *
     * createHtml("This is a paragraph", "p") => <p>This is a paragraph</p>
     * createHtml("Bold text", "strong") => <strong>Bold text</strong>
     *
     */
    public String createHtml(String content, String elementName)
    {
        //Declare variables to hold the opening and closing tabs, and use the elementName
        //to correctly format them.
        String openingTab = "<"+elementName+">";
        String closingTab = "</"+elementName+">";

        //Declare and format the output, then return it
        String outputContent = openingTab+content+closingTab;

        return outputContent;
    }

    /*
     * Sometimes Html elements do not have any content
     *
     * <p></p>
     *
     * Elements that have no content can be "self closing".
     *
     * <p />
     *
     * Modify the logic that you used for the CreateHtml
     * to return a self closing element when there is no
     * content provided.
     *
     * moreHtml("This is a paragraph", "p") => <p>This is a paragraph</p>
     * moreHtml("", "p") => <p />
     *
     */
    public String moreHtml(String content, String elementName)
    {
        String outputContent;

        //Use boolean logic to determine if content is blank; if it is, make the output
        //the correct self-closing tab. If not, call the previous function to create
        //formatted HTML.

        if (content.equals(""))
        {
            outputContent = "<"+elementName+" />";
        }
        else
        {
            outputContent = createHtml(content, elementName);
        }

        //Return the formatted HTML
        return outputContent;
    }

    /*
     * Xml is similar to Html - it uses element names
     * to describe the data that is being stored.
     *
     * Unlike html, however, there are no pre-defined
     * element names in xml. In other words, you can use
     * any word as a tag name.
     *
     * <customer><id>1</id><name>Belinda Carter</name></customer>
     *
     * The user has a list of customer id and names. They
     * will provide you each customer id and their name.
     * You are required to return a formatted xml String
     * like the pattern shown above.
     *
     * createXml(1, "Belinda Carter") => <customer><id>1</id><name>Belinda Carter</name></customer>
     *
     */
    public String createXml(int id, String name)
    {
        //Declare and create variables to store the opening and closing
        //tabs.
        String customerOpeningTag = "<customer>";
        String customerClosingTag = "</customer>";
        String idOpeningTag       = "<id>";
        String idClosingTag       = "</id>";
        String nameOpeningTag     = "<name>";
        String nameClosingTag     = "</name>";

        //Declare and format the output
        String formattedOutput = customerOpeningTag + idOpeningTag + id + idClosingTag + nameOpeningTag + name + nameClosingTag + customerClosingTag;


        return formattedOutput;
    }

    /*
     * The customer has noted that even though
     * the xml that is returned is correct, it is still
     * somewhat difficult to read because it is all on
     * a single line
     *
     * <customer><id>1</id><name>Belinda Carter</name></customer>
     *
     * Xml can be made easier to read by adding line breaks
     * and indentation like this:
     * (note: indentations are 2 spaces)
     *
     * <customer>
     *   <id>1</id>
     *   <name>Belinda Carter</name>
     * </customer>
     *
     * Modify your logic to return formatted xml.
     * each element must be on its own line.
     * Indent the nested elements with 2 spaces
     *
     * String format codes (see https://www.w3schools.com/java/java_Strings_specchars.asp):
     * \n = new line
     * \t = tab
     * \\ = \
     *
     * formattedXml(1, "Belinda Carter") => <customer>
     *                                        <id>1</id>
     *                                        <name>Belinda Carter</name>
     *                                      </customer>
     *
     */
    public String formattedXml(int id, String name)
    {
        //Declare and create variables to store the opening and closing
        //tabs.
        String customerOpeningTag = "<customer>";
        String customerClosingTag = "</customer>";
        String idOpeningTag       = "<id>";
        String idClosingTag       = "</id>";
        String nameOpeningTag     = "<name>";
        String nameClosingTag     = "</name>";

        //Declare and format the output
        String formattedOutput = customerOpeningTag + "\n" + "  " + idOpeningTag + id + idClosingTag + "\n" + "  " + nameOpeningTag + name + nameClosingTag + "\n" + customerClosingTag;
        return formattedOutput;
    }

    /*
     * In this function you will be given all the
     * individual parts of a full name. You need to
     * return the fully formatted name as a single String
     *
     * The first and last names will always have a value,
     * but a user is not required to have a middle name
     * or a suffix.
     *
     * If middle name or suffix is provided, you must
     * format the name accordingly.
     *
     * Examples:
     * formatFullName("Glen", "", "Williamson", "") => Glen Williamson
     * formatFullName("Glen", "Carter", "Williamson", "") => Glen Carter Williamson
     * formatFullName("Glen", "", "Williamson", "Jr") => Glen Williamson, Jr
     * formatFullName("Glen", "Carter", "Williamson", "Jr") => Glen Carter Williamson, Jr
     *
     */
    public String formatFullName(String firstName, String middleName, String lastName, String suffix)
    {
        //Declare a variable to hold the formatted name, and populate it with the
        //first name, which will always be present and first in the formatted output.
        String formattedName = firstName + " ";

        //If there is a middle name, append it now. If not, skip it and append the last name.
        if (middleName.isEmpty())
        {
            formattedName += lastName;
        }
        else
        {
            formattedName += middleName + " " + lastName;
        }

        //Similarly to the middle name, check if there is a suffix and append it if so.
        //Either way, return the formatted name.
        if (suffix.isEmpty())
        {
            return formattedName;
        }
        else
        {
            formattedName += ", " + suffix;
            return formattedName;
        }
    }

    /*
     * You are writing a program for HR.
     * When they hire a new employee they must be
     * given an username to access the network.
     *
     * The username must always be lower case and
     * is formatted as the employees first name
     * and last name separated by a period.
     *
     * Glen Williamson => glen.willimason
     *
     * If the employee has a middle name, the
     * middle initial should also be added like
     * this
     *
     * Glen Carter Williamson => glen.c.williamson
     *
     * Your function accepts the full name of the employee
     * and you must return the new username.
     *
     * Examples:
     * createUserName("Glen Williamson") => glen.williamson
     * createUserName("Glen Carter Williamson") => glen.c.williamson
     * createUserName("Glen Williamson, III") => glen.williamson
     *
     */
    public String createUserName(String fullName)
    {
        //Declare a string array to hold the full name, split by whitespaces, and a variable to hold
        //the output, beginning with the first name and period.
        String[] nameArray = fullName.split(" ");
        String formattedUsername = nameArray[0].toLowerCase() + ".";

        //We assume that user must give a first and last name, so if the above array is only of length 2,
        //nameArray[1] is the last name and there is no suffix. Create and return the formatted username.
        if(nameArray.length == 2)
        {
            formattedUsername += nameArray[1].toLowerCase();
            return formattedUsername;
        }

        // If the above array is of a length greater than 2, we have a middle name and/or a suffix.
        else if (!nameArray[1].contains(","))
        {
            // If the string in nameArray[1] does not contain a comma, it is a middle name and nameArray[2]
            // is the last name.
            //Add the first letter of the middle name
            formattedUsername += nameArray[1].toLowerCase().charAt(0) + ".";
            //Check to see if the last name contains a comma. If it does, there is a suffix at the end
            //which does not go into the username.
            if (nameArray[2].contains(","))
            {
                //Add the last name, ignoring the comma, and return the username
                int commaIndex = nameArray[1].indexOf(",");
                formattedUsername += nameArray[1].substring(0,commaIndex).toLowerCase();
                return formattedUsername;
            }
            else
            {
                //If the last name has no comma, append it normally.
                formattedUsername += nameArray[2].toLowerCase();
                return formattedUsername;
            }
        }
        else
        {
            //If the string in nameArray[1] does have a comma, it is a last name followed by a suffix.
            int commaIndex = nameArray[1].indexOf(",");
            formattedUsername += nameArray[1].substring(0,commaIndex).toLowerCase();
            return formattedUsername;
        }
    }
}
