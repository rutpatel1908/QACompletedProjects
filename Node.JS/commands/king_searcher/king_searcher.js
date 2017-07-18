const commando = require('discord.js-commando');

const King_Searcher_Main = require('../../commands/king_searcher/king_searcher_main');

class KingSearcherCommand extends commando.Command{

    constructor(client){
        super(client, {
            name: 'getking',
            group: 'king_searcher',
            memberName: 'getking',
            description: 'King information',
            args: [
                {
                    key: 'kingname',
                    label: 'kingname',
                    prompt: 'Please enter the king name',
                    type: 'string',
                    infinite: false
                }
            ]
        });
    }


    async run(message, {kingname}){
        
        const search_king = new King_Searcher_Main();
       
        return message.reply(search_king.displayResult(kingname));
    }

    
    
}

module.exports = KingSearcherCommand;