const commando = require("discord.js-commando");
const Garage_Main = require("../../commands/garage_operator/garage_main");


class DisplayAllCarsCommand extends commando.Command{

    constructor(client){
        super(client, {
            name: "displaycars",
            group: "garage_operator",
            memberName: "displaycars",
            description: "Checking New Car"
        });
    }

    async run(message){
       const garage = new Garage_Main();
        return message.reply(garage.outputCars());
    }
}


module.exports = DisplayAllCarsCommand;