/*Description:
*
*This time no story, no theory. The examples below show you how to write function accum:
*
*Examples:
*
*Accumul.accum("abcd");    // "A-Bb-Ccc-Dddd"
*Accumul.accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
*Accumul.accum("cwAt");    // "C-Ww-Aaa-Tttt"
*The parameter of accum is a string which includes only letters from a..z and A..Z.
*/


#include <string>
#include <cctype> 

class Accumul
{
public:
    static std::string accum(const std::string &s) {
        const int S_LENGTH = s.size();
        const int NEW_LENGTH = (S_LENGTH * (S_LENGTH + 1) / 2) + (S_LENGTH-1);
        int index = 0;
        char current = ' ';
        char newString[NEW_LENGTH];

        for (int i = 0; i < S_LENGTH; i++) {
            current = s.at(i);
            newString[index++] = std::toupper(current);
            for (int j = 1; j < (i + 1); j++)
                newString[index++] = std::tolower(current);
            if(i != (S_LENGTH - 1))
                newString[index++] = '-';
        }
        return std::string(newString, NEW_LENGTH);
    }
