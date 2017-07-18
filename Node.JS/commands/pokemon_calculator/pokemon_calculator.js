const commando = require('discord.js-commando');
const Pokemon_Main = require('../../commands/pokemon_calculator/pokemon_main');

class PokemonCalculatorCommand extends commando.Command{

    constructor(client){
        super(client, {
            name: 'fightpokemon',
            group: 'pokemon_calculator',
            memberName: 'fightpokemon',
            description: 'Pokemon information',
            args: [
                {
                    key: 'typeone',
                    label: 'typetwo',
                    prompt: 'Please enter your first pokemon type',
                    type: 'string',
                    infinite: false
                },
                {
                    key: 'typetwo',
                    label: 'typetwo',
                    prompt: 'Please enter your second pokemon type',
                    type: 'string',
                    infinite: false
                }
            ]
        });
    }

    async run(message, {typeone,typetwo}){

        const pokemon = new Pokemon_Main();
       
        return message.reply(pokemon.displayResult(typeone,typetwo));
    }

}

module.exports = PokemonCalculatorCommand;