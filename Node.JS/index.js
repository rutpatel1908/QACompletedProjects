const commando = require("discord.js-commando");
const privateStuff=require("./token");
const TOKEN=privateStuff.key;
const path = require("path");

const client = new commando.Client({
	commandPrefix: "!"
});

client.login(TOKEN);
client.on("ready", () => {
    console.log("I am ready!");
});
console.log("Online");

client.registry
	.registerGroup("api_commands", "api_commands")
	.registerGroup("dice_roller", "dice_roller")
	.registerGroup("king_searcher","king_searcher")
	.registerGroup("pokemon_calculator","pokemon_calculator")
	.registerGroup("squad_searcher","squad_searcher")
	.registerGroup("movie_searcher","movie_searcher")
	.registerGroup("weather_searcher","weather_searcher")
	.registerGroup("garage_operator","garage_operator")
	.registerDefaults()
    .registerCommandsIn(path.join(__dirname, "commands"));

console.log("Welcome to Star Movies Online Database. Please choose from the following options");