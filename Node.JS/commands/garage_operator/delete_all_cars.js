const commando = require("discord.js-commando");
const Garage_Main = require("../../commands/garage_operator/garage_main");


class DeleteAllCarsCommand extends commando.Command{

    constructor(client){
        super(client, {
            name: "deleteallcars",
            group: "garage_operator",
            memberName: "deleteallcars",
            description: "Deleting All Cars"
        });
    }

    async run(message){
       const garage = new Garage_Main();
        garage.emptyList();

		return message.reply(`The cars have been successfully deleted!`);
    }
}


module.exports = DeleteAllCarsCommand;