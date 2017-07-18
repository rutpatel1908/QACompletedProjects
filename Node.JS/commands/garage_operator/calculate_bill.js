const commando = require("discord.js-commando");
const Garage_Main = require("../../commands/garage_operator/garage_main");


class CalculateBillCarCommand extends commando.Command{

    constructor(client){
        super(client, {
            name: "calculatebill",
            group: "garage_operator",
            memberName: "calculatebill",
            description: "Calculate Bill For Car",
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
        return message.reply(`The bill for ${regnumber} is: `+garage.calculateBill(regnumber));
    }
}


module.exports = CalculateBillCarCommand;