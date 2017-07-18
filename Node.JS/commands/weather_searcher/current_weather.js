const commando = require('discord.js-commando');
const Weather_Searcher_Main = require('../../commands/weather_searcher/weather_searcher_main');

class CurrentWeatherCommand extends commando.Command{

    constructor(client){
        super(client, {
            name: 'getcurrentweather',
            group: 'weather_searcher',
            memberName: 'getcurrentweather',
            description: 'Getting Current Weather',
            args: [
                    {
                      key: 'locationname',
                      prompt: 'Please enter the name of the location\n',
                      type: 'string'
                      
                    }
		    	  ]
        });
    }

    async run(message, {locationname}){

      const getCurrentWeather = new Weather_Searcher_Main();
      return getCurrentWeather.getCurrentWeather(locationname,(a)=>message.reply(a));
    }

}

module.exports = CurrentWeatherCommand;