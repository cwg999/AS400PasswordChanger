# AS400Password Changer

This project allows you to compile a CLI runnable JAR that can change your password (expired works, but not disabled.) on an IBM i system. (AS400/DB2)
Additionally this project can serve as a template to create a more complicated program for IBM Java Toolkit begginners. 

## Installation

To set up the environment, you need to use openJDK (java) and JTOpen (IBM Java Toolkit http://www-03.ibm.com/systems/power/software/i/toolbox/downloads.html)

## Usage

To use the runnable jar in windows, use the command: 

"java -jar PATH_TO_JAR/AS400PasswordChanger.jar SYSTEMNAME USERNAME OLDPASSWORD NEWPASSWORD" 

where SYSTEMNAME is a fully qualified domain name like POWER7.HOSTNAME.DOMAIN.COM.
To simply download the runnable jar, click [here.](https://github.com/cwg999/AS400PasswordChanger/raw/master/export/AS400PasswordChanger.jar)

Otherwise, to compile it yourself open the project in Eclipse and right click the project to export and choose "runnable JAR file".

## Contributing

1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request :D

## History

Initial Release:
Showcases basic usage.

## Credits

This basic program is made possible through the JTOpen project.

## License

Copyright 2016 Cody W. Geisler

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
