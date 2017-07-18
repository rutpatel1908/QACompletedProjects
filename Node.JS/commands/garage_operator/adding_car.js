const commando = require("discord.js-commando");
const Garage_Main = require("../../commands/garage_operator/garage_main");


class AddingCarCommand extends commando.Command{

    constructor(client){
        super(client, {
            name: "addcar",
            group: "garage_operator",
            memberName: "addcar",
            description: "Checking New Car",
            args: [
				{
					key: "make",
					prompt: "What is the make of the car?\n",
					type: "string"
					
				},
				{
					key: "reg",
					prompt: "What is the reg number?\n",
					type: "string"
				
				},
                {
					key: "model",
					prompt: "what is the model of the car?\n",
					type: "string"
				
				},
                {
					key: "sf",
					prompt: "How many small faults?\n",
					type: "integer",
					min: 0
				},
                {
					key: "mf",
					prompt: "How many medium faults?\n",
					type: "integer",
					min: 0
				},
                {
					key: "lf",
					prompt: "How many large faults?\n",
					type: "integer",
					min: 0
				}
			]
        });
    }

    async run(message, {make,reg,model,sf,mf,lf}){
       const garage = new Garage_Main();
        garage.checkIn(make,reg,model,sf,mf,lf);
        return message.reply(`The car ${make}, ${model} has been successfully added!`);
    }
}


module.exports = AddingCarCommand;