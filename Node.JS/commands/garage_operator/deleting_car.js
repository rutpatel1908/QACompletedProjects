const commando = require("discord.js-commando");
const Garage_Main = require("../../commands/garage_operator/garage_main");


class DeletingCarCommand extends commando.Command{

    constructor(client){
        super(client, {
            name: "deletecar",
            group: "garage_operator",
            memberName: "deletecar",
            description: "Deleting Car",
            args: [
				{
					key: "regnumber",
					prompt: "What is the reg number?\n",
					type: "string"
				
				}
			]
        });
    }

    async run(message, {regnumber}){
       const garage = new Garage_Main();
        garage.checkOut(regnumber);
		return message.reply(`The car ${regnumber} has been successfully deleted!`);
    }
}


module.exports = DeletingCarCommand;