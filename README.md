# Discord Call and Response Bot 1

A first attempt at using the Discord API, simple call and response functionality only. 

## Description

The bot uses the [Java Discord API (JDA)](https://github.com/DV8FromTheWorld/JDA) to interact with the Discord Chat window in a text channel, providing simple canned responses.

At present the bot responds to some inside jokes, as this is intended more only as a means of experimentation with the JDA Discord API.

The application is managed using Maven


## Getting Started

### Dependencies

* A discord account.
* A Discord server with administration privileges and Developer Mode enabled (App settings -> Advanced -> Developer Mode).
* Further information on getting started can be found [here](https://discord.com/developers/docs/getting-started)
* Java 8 or newer

### Installing & Executing

* After downloading, create a new class named ````Keys.java```` as shown below:
   ``public class Keys {
    // @todo REMOVE THIS FROM VERSION CONTROL
    public static String apiKey = "xxxxxxxxxxxxxxxxxxxx";
    public static String guildId = "xxxxxxxxxxxxxxxxxxxx";
    }``

* Your guildId will be present in the server you wish to run this program on. 

* your apiKey will be created when you list your bot on the [discord developer portal](https://discord.com/developers/docs/getting-started)

* run ````JavaDiscordBot-1.0-SNAPSHOT.jar```` found in the target folder


## Further Updates

* Replace keys.java solution with more elegant solution for managing keys.
* Add functionality through slash commands to change the terms being listened for, and their responses.
* Add persistence by way of JPA.
* Add containerisation using Docker.
* Deploy remotely to allow perpetual access.

## Help
This was an early iteration of a simple Java bot for Discord, further information on creating such bots can be found at:
* [JDA Github Repo](https://github.com/DV8FromTheWorld/JDA)
* [Discord Developer Documentation](https://discord.com/developers/docs/intro)


## Authors

Contributor - [JWBrunkow](https://www.linkedin.com/in/jwbrunkow/?originalSubdomain=uk)
