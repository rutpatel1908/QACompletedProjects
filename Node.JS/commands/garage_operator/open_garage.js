const commando = require("discord.js-commando");
const Garage_Main = require("../../commands/garage_operator/garage_main");


class OpenGarageCommand extends commando.Command{

    constructor(client){
        super(client, {
            name: "opengarage",
            group: "garage_operator",
            memberName: "opengarage",
            description: "Checking New Car"
        });
    }

    async run(message){
       const garage = new Garage_Main();
       garage.openGarage();
        return message.reply("Garage Open!"+"\n"+"Current Cars:"+"\n\n"+garage.outputCars());
    }
}


module.exports = OpenGarageCommand;