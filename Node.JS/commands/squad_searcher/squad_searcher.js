const commando = require('discord.js-commando');
const Squad_Searcher_Main = require('../../commands/squad_searcher/squad_searcher_main');

class SquadSearcherCommand extends commando.Command{

    constructor(client){
        super(client, {
            name: 'getsquad',
            group: 'squad_searcher',
            memberName: 'getsquad',
            description: 'Squad information',
            args: [
                {
                    key: 'squadname',
                    label: 'squadname',
                    prompt: 'Please enter the squad name',
                    type: 'string',
                    infinite: false
                },
                {
                    key: 'membername',
                    label: 'membername',
                    prompt: 'Please enter the member name',
                    type: 'string',
                    infinite: false
                }
            ]
        });
    }

     async run(message, {squadname,membername}){

        const search_squad = new Squad_Searcher_Main();
        return search_squad.displayResult(squadname,membername,(a)=>message.reply(a));
    }
}

module.exports = SquadSearcherCommand;