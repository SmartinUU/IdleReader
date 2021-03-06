package cn.edu.gdmec.idlereader.Bean;

import java.util.List;

//api  https://api.douban.com/v2/movie/in_theaters
public class MovieBean {

    /**
     * count : 20
     * start : 0
     * total : 35
     * subjects : [{"rating":{"max":10,"average":7,"stars":"35","min":0},"genres":["动作","科幻","冒险"],"title":"侏罗纪世界2","casts":[{"alt":"https://movie.douban.com/celebrity/1017967/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1408711300.32.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1408711300.32.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1408711300.32.webp"},"name":"克里斯·帕拉特","id":"1017967"},{"alt":"https://movie.douban.com/celebrity/1027772/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p315.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p315.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p315.webp"},"name":"布莱丝·达拉斯·霍华德","id":"1027772"},{"alt":"https://movie.douban.com/celebrity/1350981/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1523860646.23.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1523860646.23.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1523860646.23.webp"},"name":"贾斯蒂斯·史密斯","id":"1350981"}],"collect_count":96060,"original_title":"Jurassic World: Fallen Kingdom","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1305510/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1372318484.25.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1372318484.25.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1372318484.25.webp"},"name":"胡安·安东尼奥·巴亚纳","id":"1305510"}],"year":"2018","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522069454.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522069454.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522069454.webp"},"alt":"https://movie.douban.com/subject/26416062/","id":"26416062"},{"rating":{"max":10,"average":8.6,"stars":"45","min":0},"genres":["喜剧","动作","动画"],"title":"超人总动员2","casts":[{"alt":"https://movie.douban.com/celebrity/1002721/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p21297.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p21297.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p21297.webp"},"name":"格雷格·T·尼尔森","id":"1002721"},{"alt":"https://movie.douban.com/celebrity/1031838/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p48614.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p48614.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p48614.webp"},"name":"霍利·亨特","id":"1031838"},{"alt":"https://movie.douban.com/celebrity/1054408/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1365913316.45.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1365913316.45.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1365913316.45.webp"},"name":"塞缪尔·杰克逊","id":"1054408"}],"collect_count":2305,"original_title":"Incredibles 2","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1027204/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1264.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1264.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1264.webp"},"name":"布拉德·伯德","id":"1027204"}],"year":"2018","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522880251.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522880251.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522880251.webp"},"alt":"https://movie.douban.com/subject/25849049/","id":"25849049"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["喜剧","动作","犯罪"],"title":"龙虾刑警","casts":[{"alt":"https://movie.douban.com/celebrity/1314827/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1445948736.67.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1445948736.67.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1445948736.67.webp"},"name":"王千源","id":"1314827"},{"alt":"https://movie.douban.com/celebrity/1316067/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1372668848.86.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1372668848.86.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1372668848.86.webp"},"name":"袁姗姗","id":"1316067"},{"alt":"https://movie.douban.com/celebrity/1274276/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1403277374.05.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1403277374.05.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1403277374.05.webp"},"name":"刘桦","id":"1274276"}],"collect_count":230,"original_title":"龙虾刑警","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1312794/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p38549.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p38549.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p38549.webp"},"name":"李昕芸","id":"1312794"}],"year":"2018","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2523437806.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2523437806.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2523437806.webp"},"alt":"https://movie.douban.com/subject/26992383/","id":"26992383"},{"rating":{"max":10,"average":8,"stars":"40","min":0},"genres":["喜剧","家庭"],"title":"生存家族","casts":[{"alt":"https://movie.douban.com/celebrity/1009219/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p2131.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p2131.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p2131.webp"},"name":"小日向文世","id":"1009219"},{"alt":"https://movie.douban.com/celebrity/1014844/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p16385.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p16385.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p16385.webp"},"name":"深津绘里","id":"1014844"},{"alt":"https://movie.douban.com/celebrity/1315238/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1506179491.3.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1506179491.3.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1506179491.3.webp"},"name":"泉泽祐希","id":"1315238"}],"collect_count":26489,"original_title":"サバイバルファミリー","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1164069/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p26869.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p26869.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p26869.webp"},"name":"矢口史靖","id":"1164069"}],"year":"2017","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2524817758.webp","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2524817758.webp","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2524817758.webp"},"alt":"https://movie.douban.com/subject/26815162/","id":"26815162"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["悬疑","惊悚"],"title":"伊阿索密码","casts":[{"alt":"https://movie.douban.com/celebrity/1274641/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1386693587.68.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1386693587.68.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1386693587.68.webp"},"name":"梁静","id":"1274641"},{"alt":"https://movie.douban.com/celebrity/1312817/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p14006.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p14006.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p14006.webp"},"name":"赵立新","id":"1312817"},{"alt":"https://movie.douban.com/celebrity/1330228/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1488608409.84.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1488608409.84.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1488608409.84.webp"},"name":"李兰迪","id":"1330228"}],"collect_count":27,"original_title":"伊阿索密码","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1320284/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1528968681.83.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1528968681.83.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1528968681.83.webp"},"name":"李伟","id":"1320284"},{"alt":"https://movie.douban.com/celebrity/1395467/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1528968667.5.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1528968667.5.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1528968667.5.webp"},"name":"张楠","id":"1395467"}],"year":"2018","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2523684148.webp","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2523684148.webp","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2523684148.webp"},"alt":"https://movie.douban.com/subject/26677141/","id":"26677141"},{"rating":{"max":10,"average":3.4,"stars":"20","min":0},"genres":["喜剧","动作"],"title":"猛虫过江","casts":[{"alt":"https://movie.douban.com/celebrity/1274081/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p34055.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p34055.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p34055.webp"},"name":"小沈阳","id":"1274081"},{"alt":"https://movie.douban.com/celebrity/1316365/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p36063.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p36063.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p36063.webp"},"name":"潘斌龙","id":"1316365"},{"alt":"https://movie.douban.com/celebrity/1341903/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1446281965.79.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1446281965.79.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1446281965.79.webp"},"name":"宋芸桦","id":"1341903"}],"collect_count":6806,"original_title":"猛虫过江","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1274081/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p34055.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p34055.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p34055.webp"},"name":"小沈阳","id":"1274081"}],"year":"2018","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2523437699.webp","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2523437699.webp","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2523437699.webp"},"alt":"https://movie.douban.com/subject/26818314/","id":"26818314"},{"rating":{"max":10,"average":5.8,"stars":"30","min":0},"genres":["科幻","悬疑","恐怖"],"title":"凤凰城遗忘录","casts":[{"alt":"https://movie.douban.com/celebrity/1394668/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"Florence Hartigan","id":"1394668"},{"alt":"https://movie.douban.com/celebrity/1394669/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"Luke Spencer Roberts","id":"1394669"},{"alt":"https://movie.douban.com/celebrity/1378648/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/pWwD3wQiTZ_Mcel_avatar_uploaded1501983562.18.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/pWwD3wQiTZ_Mcel_avatar_uploaded1501983562.18.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/pWwD3wQiTZ_Mcel_avatar_uploaded1501983562.18.webp"},"name":"切尔西·洛佩兹","id":"1378648"}],"collect_count":340,"original_title":"Phoenix Forgotten","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1307066/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"Justin Barber","id":"1307066"}],"year":"2017","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2525588406.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2525588406.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2525588406.webp"},"alt":"https://movie.douban.com/subject/26990268/","id":"26990268"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["剧情","喜剧"],"title":"监狱犬计划","casts":[{"alt":"https://movie.douban.com/celebrity/1042568/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13664.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13664.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13664.webp"},"name":"郝蕾","id":"1042568"},{"alt":"https://movie.douban.com/celebrity/1337891/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1392696207.67.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1392696207.67.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1392696207.67.webp"},"name":"刘帅良","id":"1337891"},{"alt":"https://movie.douban.com/celebrity/1362975/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1475988686.98.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1475988686.98.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1475988686.98.webp"},"name":"裴魁山","id":"1362975"}],"collect_count":228,"original_title":"监狱犬计划","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1352793/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1451286288.54.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1451286288.54.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1451286288.54.webp"},"name":"郭大雷","id":"1352793"}],"year":"2018","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2524984706.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2524984706.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2524984706.webp"},"alt":"https://movie.douban.com/subject/27166974/","id":"27166974"},{"rating":{"max":10,"average":8.3,"stars":"45","min":0},"genres":["动作","科幻","奇幻"],"title":"复仇者联盟3：无限战争","casts":[{"alt":"https://movie.douban.com/celebrity/1016681/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p56339.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p56339.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p56339.webp"},"name":"小罗伯特·唐尼","id":"1016681"},{"alt":"https://movie.douban.com/celebrity/1021959/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4053.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4053.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4053.webp"},"name":"克里斯·海姆斯沃斯","id":"1021959"},{"alt":"https://movie.douban.com/celebrity/1017885/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1359877729.49.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1359877729.49.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1359877729.49.webp"},"name":"克里斯·埃文斯","id":"1017885"}],"collect_count":338742,"original_title":"Avengers: Infinity War","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1321812/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p51466.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p51466.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p51466.webp"},"name":"安东尼·罗素","id":"1321812"},{"alt":"https://movie.douban.com/celebrity/1320870/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1525505053.79.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1525505053.79.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1525505053.79.webp"},"name":"乔·罗素","id":"1320870"}],"year":"2018","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2517753454.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2517753454.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2517753454.webp"},"alt":"https://movie.douban.com/subject/24773958/","id":"24773958"},{"rating":{"max":10,"average":5.7,"stars":"30","min":0},"genres":["剧情","犯罪"],"title":"泄密者","casts":[{"alt":"https://movie.douban.com/celebrity/1037098/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p402.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p402.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p402.webp"},"name":"吴镇宇","id":"1037098"},{"alt":"https://movie.douban.com/celebrity/1050979/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1241.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1241.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1241.webp"},"name":"张智霖","id":"1050979"},{"alt":"https://movie.douban.com/celebrity/1019718/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p40059.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p40059.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p40059.webp"},"name":"佘诗曼","id":"1019718"}],"collect_count":4496,"original_title":"洩密者","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1274313/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p28346.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p28346.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p28346.webp"},"name":"邱礼涛","id":"1274313"}],"year":"2018","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2524686290.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2524686290.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2524686290.webp"},"alt":"https://movie.douban.com/subject/27195080/","id":"27195080"},{"rating":{"max":10,"average":7.2,"stars":"35","min":0},"genres":["喜剧","奇幻"],"title":"超时空同居","casts":[{"alt":"https://movie.douban.com/celebrity/1312940/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1503986232.61.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1503986232.61.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1503986232.61.webp"},"name":"雷佳音","id":"1312940"},{"alt":"https://movie.douban.com/celebrity/1275756/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1367210981.95.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1367210981.95.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1367210981.95.webp"},"name":"佟丽娅","id":"1275756"},{"alt":"https://movie.douban.com/celebrity/1325751/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1499435823.67.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1499435823.67.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1499435823.67.webp"},"name":"张衣","id":"1325751"}],"collect_count":120639,"original_title":"超时空同居","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1331887/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1520837465.56.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1520837465.56.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1520837465.56.webp"},"name":"苏伦","id":"1331887"}],"year":"2018","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2520331478.webp","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2520331478.webp","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2520331478.webp"},"alt":"https://movie.douban.com/subject/27133303/","id":"27133303"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["动作","古装"],"title":"九门提督","casts":[{"alt":null,"avatars":null,"name":"虎虎","id":null},{"alt":null,"avatars":null,"name":"洪浚嘉","id":null},{"alt":null,"avatars":null,"name":"郭万超","id":null}],"collect_count":67,"original_title":"九门提督","subtype":"movie","directors":[{"alt":null,"avatars":null,"name":"张博","id":null}],"year":"2018","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2525571689.webp","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2525571689.webp","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2525571689.webp"},"alt":"https://movie.douban.com/subject/30252404/","id":"30252404"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["喜剧","动画","冒险"],"title":"第七个小矮人","casts":[{"alt":"https://movie.douban.com/celebrity/1010447/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"Otto Waalkes","id":"1010447"},{"alt":"https://movie.douban.com/celebrity/1127409/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"Mirco Nontschew","id":"1127409"},{"alt":"https://movie.douban.com/celebrity/1059956/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"Boris Aljinovic","id":"1059956"}],"collect_count":409,"original_title":"The 7th Dwarf","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1059956/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"Boris Aljinovic","id":"1059956"},{"alt":"https://movie.douban.com/celebrity/1393195/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1529156715.84.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1529156715.84.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1529156715.84.webp"},"name":"哈莱德·西博门","id":"1393195"}],"year":"2014","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2522252598.webp","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2522252598.webp","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2522252598.webp"},"alt":"https://movie.douban.com/subject/25971649/","id":"25971649"},{"rating":{"max":10,"average":3.6,"stars":"20","min":0},"genres":["喜剧"],"title":"幸福马上来","casts":[{"alt":"https://movie.douban.com/celebrity/1274535/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4973.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4973.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4973.webp"},"name":"冯巩","id":"1274535"},{"alt":"https://movie.douban.com/celebrity/1315624/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p32820.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p32820.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p32820.webp"},"name":"毛俊杰","id":"1315624"},{"alt":"https://movie.douban.com/celebrity/1336305/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1473508881.63.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1473508881.63.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1473508881.63.webp"},"name":"刘昊然","id":"1336305"}],"collect_count":3470,"original_title":"幸福马上来","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1274535/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4973.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4973.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4973.webp"},"name":"冯巩","id":"1274535"},{"alt":"https://movie.douban.com/celebrity/1355104/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1499080610.06.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1499080610.06.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1499080610.06.webp"},"name":"崔俊杰","id":"1355104"}],"year":"2018","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2521514148.webp","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2521514148.webp","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2521514148.webp"},"alt":"https://movie.douban.com/subject/26813286/","id":"26813286"},{"rating":{"max":10,"average":7.1,"stars":"35","min":0},"genres":["剧情","喜剧"],"title":"厕所英雄","casts":[{"alt":"https://movie.douban.com/celebrity/1049615/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p14444.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p14444.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p14444.webp"},"name":"阿克谢·库玛尔","id":"1049615"},{"alt":"https://movie.douban.com/celebrity/1054303/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p7480.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p7480.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p7480.webp"},"name":"阿努潘·凯尔","id":"1054303"},{"alt":"https://movie.douban.com/celebrity/1354711/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1503377711.83.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1503377711.83.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1503377711.83.webp"},"name":"布米·佩德卡尔","id":"1354711"}],"collect_count":19362,"original_title":"Toilet - Ek Prem Katha","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1339168/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1503377434.16.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1503377434.16.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1503377434.16.webp"},"name":"什里·那拉扬·辛","id":"1339168"}],"year":"2017","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2523632248.webp","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2523632248.webp","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2523632248.webp"},"alt":"https://movie.douban.com/subject/26942645/","id":"26942645"},{"rating":{"max":10,"average":6.4,"stars":"35","min":0},"genres":["剧情","传记","历史"],"title":"青年马克思","casts":[{"alt":"https://movie.douban.com/celebrity/1014063/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p22970.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p22970.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p22970.webp"},"name":"奥古斯特·迪尔","id":"1014063"},{"alt":"https://movie.douban.com/celebrity/1387917/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1517306102.13.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1517306102.13.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1517306102.13.webp"},"name":"史特凡·柯纳斯克","id":"1387917"},{"alt":"https://movie.douban.com/celebrity/1341743/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1406537335.62.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1406537335.62.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1406537335.62.webp"},"name":"薇姬·克里普斯","id":"1341743"}],"collect_count":3928,"original_title":"Le jeune Karl Marx","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1294186/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1484919465.79.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1484919465.79.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1484919465.79.webp"},"name":"哈乌·佩克","id":"1294186"}],"year":"2017","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2521271645.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2521271645.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2521271645.webp"},"alt":"https://movie.douban.com/subject/5330387/","id":"5330387"},{"rating":{"max":10,"average":6.7,"stars":"35","min":0},"genres":["动画","奇幻","冒险"],"title":"哆啦A梦：大雄的金银岛","casts":[{"alt":"https://movie.douban.com/celebrity/1024195/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1375424738.93.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1375424738.93.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1375424738.93.webp"},"name":"水田山葵","id":"1024195"},{"alt":"https://movie.douban.com/celebrity/1326329/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1358580306.49.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1358580306.49.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1358580306.49.webp"},"name":"大原惠美","id":"1326329"},{"alt":"https://movie.douban.com/celebrity/1020284/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p36838.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p36838.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p36838.webp"},"name":"嘉数由美","id":"1020284"}],"collect_count":17917,"original_title":"ドラえもん のび太の宝島","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1393923/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1526998131.45.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1526998131.45.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1526998131.45.webp"},"name":"今井一晓","id":"1393923"}],"year":"2018","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2523364763.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2523364763.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2523364763.webp"},"alt":"https://movie.douban.com/subject/27069070/","id":"27069070"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["动作","爱情","冒险"],"title":"致命夺宝","casts":[{"alt":"https://movie.douban.com/celebrity/1394041/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1527158052.66.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1527158052.66.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1527158052.66.webp"},"name":"于果儿","id":"1394041"},{"alt":"https://movie.douban.com/celebrity/1394042/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1527158064.25.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1527158064.25.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1527158064.25.webp"},"name":"王可","id":"1394042"},{"alt":"https://movie.douban.com/celebrity/1394043/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1527157898.17.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1527157898.17.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1527157898.17.webp"},"name":"大卫·毕加索","id":"1394043"}],"collect_count":7,"original_title":"致命夺宝","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1394040/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1527158037.52.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1527158037.52.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1527158037.52.webp"},"name":"冯铁城","id":"1394040"}],"year":"2018","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2524047425.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2524047425.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2524047425.webp"},"alt":"https://movie.douban.com/subject/30230633/","id":"30230633"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["喜剧","科幻","动画"],"title":"吃货宇宙","casts":[{"alt":"https://movie.douban.com/celebrity/1395278/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"张鹤来","id":"1395278"},{"alt":"https://movie.douban.com/celebrity/1395298/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"张栩儿","id":"1395298"},{"alt":"https://movie.douban.com/celebrity/1395299/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"刘思童","id":"1395299"}],"collect_count":477,"original_title":"吃货宇宙","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1393740/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1528271772.77.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1528271772.77.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1528271772.77.webp"},"name":"陈廖宇","id":"1393740"}],"year":"2018","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522682953.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522682953.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522682953.webp"},"alt":"https://movie.douban.com/subject/26791910/","id":"26791910"},{"rating":{"max":10,"average":3.9,"stars":"20","min":0},"genres":["动画","奇幻","冒险"],"title":"潜艇总动员：海底两万里","casts":[{"alt":"https://movie.douban.com/celebrity/1321911/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1501821131.88.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1501821131.88.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1501821131.88.webp"},"name":"范楚绒","id":"1321911"},{"alt":"https://movie.douban.com/celebrity/1328170/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/ptkt9Jive6AAcel_avatar_uploaded1366255850.41.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/ptkt9Jive6AAcel_avatar_uploaded1366255850.41.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/ptkt9Jive6AAcel_avatar_uploaded1366255850.41.webp"},"name":"洪海天","id":"1328170"},{"alt":"https://movie.douban.com/celebrity/1326522/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1498555670.36.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1498555670.36.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1498555670.36.webp"},"name":"李晔","id":"1326522"}],"collect_count":771,"original_title":"潜艇总动员：海底两万里","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1374801/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1496307826.17.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1496307826.17.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1496307826.17.webp"},"name":"申宇","id":"1374801"}],"year":"2018","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522417650.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522417650.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522417650.webp"},"alt":"https://movie.douban.com/subject/30146980/","id":"30146980"}]
     * title : 正在上映的电影-北京
     */

    private int count;
    private int start;
    private int total;
    private String title;
    private List<SubjectsBean> subjects;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SubjectsBean> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectsBean> subjects) {
        this.subjects = subjects;
    }

    public static class SubjectsBean {
        /**
         * rating : {"max":10,"average":7,"stars":"35","min":0}
         * genres : ["动作","科幻","冒险"]
         * title : 侏罗纪世界2
         * casts : [{"alt":"https://movie.douban.com/celebrity/1017967/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1408711300.32.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1408711300.32.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1408711300.32.webp"},"name":"克里斯·帕拉特","id":"1017967"},{"alt":"https://movie.douban.com/celebrity/1027772/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p315.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p315.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p315.webp"},"name":"布莱丝·达拉斯·霍华德","id":"1027772"},{"alt":"https://movie.douban.com/celebrity/1350981/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1523860646.23.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1523860646.23.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1523860646.23.webp"},"name":"贾斯蒂斯·史密斯","id":"1350981"}]
         * collect_count : 96060
         * original_title : Jurassic World: Fallen Kingdom
         * subtype : movie
         * directors : [{"alt":"https://movie.douban.com/celebrity/1305510/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1372318484.25.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1372318484.25.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1372318484.25.webp"},"name":"胡安·安东尼奥·巴亚纳","id":"1305510"}]
         * year : 2018
         * images : {"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522069454.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522069454.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522069454.webp"}
         * alt : https://movie.douban.com/subject/26416062/
         * id : 26416062
         */

        private RatingBean rating;
        private String title;
        private int collect_count;
        private String original_title;
        private String subtype;
        private String year;
        private ImagesBean images;
        private String alt;
        private String id;
        private List<String> genres;
        private List<CastsBean> casts;
        private List<DirectorsBean> directors;

        public RatingBean getRating() {
            return rating;
        }

        public void setRating(RatingBean rating) {
            this.rating = rating;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getCollect_count() {
            return collect_count;
        }

        public void setCollect_count(int collect_count) {
            this.collect_count = collect_count;
        }

        public String getOriginal_title() {
            return original_title;
        }

        public void setOriginal_title(String original_title) {
            this.original_title = original_title;
        }

        public String getSubtype() {
            return subtype;
        }

        public void setSubtype(String subtype) {
            this.subtype = subtype;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public ImagesBean getImages() {
            return images;
        }

        public void setImages(ImagesBean images) {
            this.images = images;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<String> getGenres() {
            return genres;
        }

        public void setGenres(List<String> genres) {
            this.genres = genres;
        }

        public List<CastsBean> getCasts() {
            return casts;
        }

        public void setCasts(List<CastsBean> casts) {
            this.casts = casts;
        }

        public List<DirectorsBean> getDirectors() {
            return directors;
        }

        public void setDirectors(List<DirectorsBean> directors) {
            this.directors = directors;
        }

        public static class RatingBean {
            /**
             * max : 10
             * average : 7
             * stars : 35
             * min : 0
             */

            private int max;
            private double average;
            private String stars;
            private int min;

            public int getMax() {
                return max;
            }

            public void setMax(int max) {
                this.max = max;
            }

            public double getAverage() {
                return average;
            }

            public void setAverage(double average) {
                this.average = average;
            }

            public String getStars() {
                return stars;
            }

            public void setStars(String stars) {
                this.stars = stars;
            }

            public int getMin() {
                return min;
            }

            public void setMin(int min) {
                this.min = min;
            }
        }

        public static class ImagesBean {
            /**
             * small : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522069454.webp
             * large : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522069454.webp
             * medium : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522069454.webp
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }

        public static class CastsBean {
            /**
             * alt : https://movie.douban.com/celebrity/1017967/
             * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1408711300.32.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1408711300.32.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1408711300.32.webp"}
             * name : 克里斯·帕拉特
             * id : 1017967
             */

            private String alt;
            private AvatarsBean avatars;
            private String name;
            private String id;

            public String getAlt() {
                return alt;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }

            public AvatarsBean getAvatars() {
                return avatars;
            }

            public void setAvatars(AvatarsBean avatars) {
                this.avatars = avatars;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public static class AvatarsBean {
                /**
                 * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1408711300.32.webp
                 * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1408711300.32.webp
                 * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1408711300.32.webp
                 */

                private String small;
                private String large;
                private String medium;

                public String getSmall() {
                    return small;
                }

                public void setSmall(String small) {
                    this.small = small;
                }

                public String getLarge() {
                    return large;
                }

                public void setLarge(String large) {
                    this.large = large;
                }

                public String getMedium() {
                    return medium;
                }

                public void setMedium(String medium) {
                    this.medium = medium;
                }
            }
        }

        public static class DirectorsBean {
            /**
             * alt : https://movie.douban.com/celebrity/1305510/
             * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1372318484.25.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1372318484.25.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1372318484.25.webp"}
             * name : 胡安·安东尼奥·巴亚纳
             * id : 1305510
             */

            private String alt;
            private AvatarsBeanX avatars;
            private String name;
            private String id;

            public String getAlt() {
                return alt;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }

            public AvatarsBeanX getAvatars() {
                return avatars;
            }

            public void setAvatars(AvatarsBeanX avatars) {
                this.avatars = avatars;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public static class AvatarsBeanX {
                /**
                 * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1372318484.25.webp
                 * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1372318484.25.webp
                 * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1372318484.25.webp
                 */

                private String small;
                private String large;
                private String medium;

                public String getSmall() {
                    return small;
                }

                public void setSmall(String small) {
                    this.small = small;
                }

                public String getLarge() {
                    return large;
                }

                public void setLarge(String large) {
                    this.large = large;
                }

                public String getMedium() {
                    return medium;
                }

                public void setMedium(String medium) {
                    this.medium = medium;
                }
            }
        }
    }
}