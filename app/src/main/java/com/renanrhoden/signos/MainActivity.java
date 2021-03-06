package com.renanrhoden.signos;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listaDeSignos;
    private String[] signos = {
            "Capricórnio", "Aquário", "Peixes", "Áries", "Touro", "Gêmeos",
            "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário"
    };
    private String[] detalhesDosSignos = {
            "Quando se trata de profissionalismo e valores tradicionais, Capricórnio é o primeiro. Capricórnio é prático e é considerado como o signo mais sério do zodíaco, possuindo uma independência que permite progressos significativos tanto no nível pessoal quanto nos negócios.\n" +
                    "Como um signo de Terra, para um capricorniano não há nada mais importante na vida do que a família. Capricórnio é um mestre em autocontrole e tem o potencial para ser um grande líder ou gestor, desde que seja na esfera dos negócios.\n" +
                    "Saturno é o planeta regente de Capricórnio, e este planeta representa restrições de todos os tipos. A influência de Saturno faz do nascido em Capricórnio prático e responsável, que sabem como poupar dinheiro para o futuro. São mestres quando precisam provar que estão certos. As pessoas nascidas sob o signo de Capricórnio, por vezes, podem ser muito teimosas. Elas se esforçam para chegar ao topo apenas com sua experiência.\n" +
                    "Problemas podem ocorrer quando o Capricórnio é forçado a estar muito próximo de seus associados. Ele tem dificuldade em aceitar as diferenças nos outros e, em situações assim, veem uma necessidade de controlar as pessoas ou impor seus valores tradicionalistas. Eles pensam que são os únicos que sabem como resolver um problema, mas eles devem aprender a perdoar os outros, a permitir-lhes ser quem são e parar de condená-los.",
            "Os aquarianos são tímidos e quietos, mas por outro lado eles podem ser excêntricos e energéticos. No entanto, em ambos os casos, eles são profundos pensadores e pessoas altamente intelectuais que gostam de ajudar os outros. Eles são capazes de enxergar sem preconceitos, em ambos os lados, o que os torna pessoas que facilmente resolvem problemas.\n" +
                    "Embora eles possam facilmente adaptar-se à energia que os rodeia, os aquarianos têm uma profunda necessidade de ficar algum tempo sozinho e longe de tudo, a fim de restabelecer a energia. As pessoas nascidas sob o signo de Aquário veem o mundo como um lugar cheio de possibilidades.\n" +
                    "Aquário é um signo de ar, e como tal, usa sua mente em todas as oportunidades. Se não houver estímulo mental, eles ficam entediados e sem motivação para alcançar o melhor resultado.\n" +
                    "O planeta regente de Aquário \u0096 Urano - tem uma natureza tímida, abrupta e às vezes agressiva, mas também dá ao aquariano a qualidade de ser visionário. Eles são capazes de perceber o futuro e sabem exatamente o que eles querem estar fazendo daqui a cinco ou dez anos.\n" +
                    "Urano também dá a eles o poder de transformação rápida e fácil, por isso eles são conhecidos como pensadores, progressistas e humanistas. Eles se sentem bem em um grupo ou uma comunidade, então constantemente se esforçam para estarem cercados de outras pessoas.\n" +
                    "O maior problema para os nascidos em Aquário é a sensação de que estejam limitados ou restringidos. Por causa do seu desejo de liberdade e igualdade para todos, eles sempre se esforçarão para garantir a liberdade de expressão e movimento. Eles têm a reputação de serem pessoas frias e insensíveis, mas isto é apenas um mecanismo de defesa contra a intimidade prematura. Eles precisam aprender a confiar nos outros e expressar suas emoções de uma forma saudável.",
            "Piscianos são muito simpáticos, então eles muitas vezes se encontram na companhia de pessoas muito diferentes. São altruístas, estão sempre dispostos a ajudar os outros, sem esperar receber nada em troca.\n" +
                    "Peixes é um signo de água e, dessa forma, este signo do zodíaco é caracterizado por empatia e capacidade emocional expressa.\n" +
                    "Seu planeta regente é Netuno, assim Peixes é mais intuitivo que a maioria e tem talento artístico. Netuno está ligado à música, então Peixes revela preferências musicais nos primeiros estágios da vida. Eles são generosos, compassivos e extremamente fiéis e carinhosos.\n" +
                    "As pessoas nascidas sob o signo de Peixes têm uma compreensão intuitiva do ciclo da vida e, assim, alcançam a melhor relação emocional com outros seres.\n" +
                    "Os nascidos em Peixes são conhecidos por sua sabedoria, mas, sob a influência de Urano, Peixes pode por vezes assumir o papel de mártir, a fim de chamar a atenção. Piscianos nunca criticam e sempre perdoam. Eles também são conhecidos por serem os mais tolerantes de todos os signos do zodíaco.",
            "Como o primeiro signo do zodíaco, a presença de Áries quase sempre marca o início de algo enérgico e turbulento. Estas pessoas estão continuamente à procura de dinâmica, velocidade e competição. Elas estão sempre em primeiro lugar em tudo - do trabalho a encontros sociais. Graças ao seu planeta regente Marte, Áries é um dos signos do zodíaco mais ativos. As pessoas nascidas sob o signo de Áries são destinadas a enfatizar a busca de respostas para questões pessoais e metafísicas. Esta é a maior característica desta encarnação.\n" +
                    "Áries é um signo de fogo, assim como Leão e Sagitário. Isso significa que está em sua natureza tomar medidas e ações, mesmo às vezes sem pensar. Seu regente fogo afeta suas excelentes habilidades organizacionais, de forma que você raramente vai encontrar um ariano que não gosta de fazer muitas coisas ao mesmo tempo, muitas vezes até mesmo antes do intervalo de almoço! Os desafios aumentam quando eles são impacientes, agressivos e descontam a sua raiva sobre os outros.\n" +
                    "Áries rege a cabeça e conduz com a cabeça, muitas vezes literalmente se jogam de cabeça, inclinando-se para frente a fim de adquirir maior velocidade e foco. Eles são naturalmente corajosos e raramente têm medo de julgamentos e riscos. Eles possuem uma força jovem e muita energia, independentemente da idade. Eles executam tarefas em tempo recorde. Ao alinhar-se com eles mesmos, são capazes de atingir os melhores resultados.",
            "Poderoso e confiável, Touro é o primeiro quando se trata de colher os frutos do seu trabalho. Eles adoram tudo o que é bom e belo, e eles vivem muitas vezes cercados por prazeres materiais. As pessoas nascidas sob o signo de Touro são muito sensuais e táteis. O toque é extremamente importante para eles, tanto nos negócios quanto no romance. Estável e conservador, Touro é um dos signos mais confiáveis do zodíaco. A teimosia é uma característica que o faz levar tudo até as últimas consequências, de modo a cumprir seus rígidos padrões.\n" +
                    "Como um signo de terra, Touro pode tornar-se superprotetor de seus entes queridos. Eles são ótimos em ganhar dinheiro e seguirão com os seus projetos até que sejam concluídos com êxito.\n" +
                    "Os taurinos são muitas vezes conhecidos pela sua dureza, que também pode ser interpretada como um compromisso com a execução de tarefas. Isso os torna excelentes trabalhadores e grandes amigos, porque eles estão sempre presentes, para o que der e vier.\n" +
                    "Seu planeta regente Vênus representa o amor, atração, beleza e criatividade. Assim, Touro pode ser um excelente cozinheiro ou artista. Ele é leal e não gosta de mudanças repentinas e indesejáveis.\n" +
                    "Touro é o signo mais confiável do zodíaco. Embora alguns possam ter visões muito conservadoras do mundo, ou possam também gostar de dinheiro e riqueza um pouco demais, eles têm a capacidade de levar a voz da razão prática a qualquer situação caótica e insalubre.\n",
            "Expressivo e de raciocínio rápido, Gêmeos representa dois lados diferentes da mesma personalidade e você nunca vai ter certeza de com quem você está falando. Gêmeos pode ser sociável, comunicativo e pronto para se divertir, entretanto, por outro lado, pode ser muito sério, pensativo, inquieto e indeciso.\n" +
                    "Sendo um signo de ar, Gêmeos está preocupado com todos os aspectos da mente. Este signo é regido por Mercúrio, que é o planeta que representa a comunicação, escrita e ensinar os outros. Eles ficam fascinados por quase tudo no mundo e têm uma constante sensação de que não há tempo suficiente para experimentar tudo o que eles querem ver. Isso os torna excelentes artistas, escritores e jornalistas. O signo de Gêmeos significa que às vezes as pessoas nascidas sob este signo têm a sensação de que sua outra metade está faltando, então eles estão sempre à procura de novos amigos, mentores e colegas.\n" +
                    "Gêmeos é versátil, curioso, divertido e quer experimentar tudo o que existe no mundo, então a sua companhia nunca é chata ou entediante.",
            "Profundamente intuitivo e sentimental, o canceriano pode ser um dos signos do zodíaco mais desafiadores para entender. Câncer é muito emocional e sensível, e se preocupa com a família e a casa. É simpático e muito apegado às pessoas que o cercam. As pessoas nascidas sob o signo de Câncer são pessoas muito leais e empáticas, capazes de sentir empatia com a dor e sofrimento alheios.\n" +
                    "Devido ao seu planeta regente ser a Lua, as várias fases do ciclo lunar podem aprofundar os mistérios internos de Câncer e criar padrões emocionais que o canceriano sensível não consegue controlar, especialmente quando criança. Isso pode mostrar-se através de alterações de humor, egoísmo, manipulação e acessos de raiva. Câncer é rápido para ajudar os outros e evitar conflitos. Um dos seus pontos mais fortes é a sua persistente determinação. Câncer não tem grandes ambições, porque eles estão felizes e contentes de ter uma família amorosa e uma casa tranquila e harmoniosa. Eles costumam cuidar bem de seus colegas de trabalho e tratá-los como família.",
            "As pessoas nascidas sob o signo de Leão são líderes natos. Eles são dramáticos, criativos, autoconfiantes, dominantes e extremamente difíceis de resistir. Eles podem conseguir qualquer coisa que queiram, seja no trabalho ou no tempo gasto com a família e amigos.\n" +
                    "Leão é um signo de fogo, o que significa que ele ama a vida e espera ter diversão. Como outros signos de fogo, Sagitário e Áries, Leão também é capaz de usar sua mente para resolver os problemas mais difíceis e geralmente toma a iniciativa para resolver várias situações complicadas.\n" +
                    "Regido pelo Sol, Leão adora o Sol em todas as suas formas, o que é também uma expressão metafórica do estado de seu ego. Isso pode ser bom, pois leoninos facilmente vão atrás do que precisam. Mas, por outro lado, pode ser problemático quando ignoram os problemas e necessidades dos outros, a fim de realizar seus próprios desejos.\n" +
                    "Leão tem uma força específica e um status de \"rei da selva\". Ele muitas vezes tem muitos amigos, porque é muito generoso e leal. Autoconfiante e atraente, capaz de unir diversos grupos de pessoas em várias oportunidades.\n" +
                    "Os problemas começam a surgir quando se torna muito orgulhoso de suas próprias realizações. Este signo do zodíaco também pode ser arrogante, preguiçoso e inflexível, porque ele pensa que alguém sempre vai arrumar a bagunça dele. Um senso de humor saudável pode fazer a convivência com outras pessoas mais fácil.",
            "Os virginianos estão sempre prestando atenção nos menores detalhes e seu profundo senso de humanidade faz com que seja um dos signos mais cuidadosos do zodíaco. Sua abordagem metódica de vida garante que nada é deixado ao acaso. Os virginianos são muitas vezes delicados, mas também muito cuidadosos.\n" +
                    "Virgem é um signo de Terra, preferindo as coisas conservadoras e organizadas, e os que dependem deles. As pessoas nascidas sob o signo de Virgem levam uma vida muito organizada; e mesmo que eles sejam bagunceiros, seus objetivos e sonhos estão localizados em pontos estritamente definidos em sua mente.\n" +
                    "Como Mercúrio é o planeta regente de Virgem, este signo tem um sentido muito aguçado de fala e escrita, bem como todas as outras formas de comunicação. Muitos virginianos podem optar por seguir uma carreira como escritor ou jornalista. Virgem é muitas vezes incompreendido, por causa do simbolismo do nome deste signo. É como se experimentassem tudo pela primeira vez. Os virginianos sempre querem servir e agradar aos outros, por isso muitas vezes optam por trabalhar como cuidadores.\n" +
                    "Por outro lado, este signo às vezes é muito crítico e demasiadamente preocupado.",
            "As pessoas nascidas sob o signo de Libra são pacíficas e justas, e odeiam ficar sozinhas. A parceria é muito importante para os librianos, e com a sua mentalidade vitoriosa e cooperação, eles não conseguem ficar sozinhos. Libra é um signo de Ar, com o intelecto expresso e uma mente afiada. Eles se sentem inspirados por bons livros, discussões insuperáveis e pessoas interessantes.\n" +
                    "O planeta regente de Libra é Vênus, que é um amante das coisas belas, por isso a qualidade é sempre mais importante que a quantidade para pessoas nascidas sob o signo de Libra. Eles estão sempre rodeados por arte, música e lugares bonitos. São, por natureza, cooperativos, de modo que frequentemente trabalham em equipe.\n" +
                    "Libra é fascinado por equilíbrio e simetria. Os nascidos em Libra preferem a justiça e a igualdade, e não conseguem tolerar a injustiça. Eles evitam entregar-se a todos os tipos de conflitos e preferem manter a paz, sempre que possível. Eles gostam de fazer tudo acompanhados e nunca sozinhos.\n" +
                    "O maior problema para os librianos é quando eles são forçados a escolher lados, porque são muito indecisos e às vezes esquecem-se da sua própria opinião.",
            "Os nascidos em Escorpião são pessoas apaixonadas e assertivas. Eles são determinados e decisivos, e pesquisam até encontrar a verdade. O Escorpião é um grande líder, sempre consciente das situações e também se destaca na engenhosidade.\n" +
                    "Escorpião é um signo de água e vive para experimentar e expressar emoções. Embora as emoções sejam muito importantes para o Escorpião, elas se manifestam de forma diferente do que os outros signos de água. De qualquer forma, você pode ter certeza de que o Escorpião vai manter seus segredos, sejam eles quais forem.\n" +
                    "Plutão é o planeta da transformação e regeneração, e também o regente deste signo do zodíaco. Escorpianos são conhecidos por seu comportamento calmo e frio, e por sua aparência misteriosa. As pessoas costumam dizer que os nascidos em Escorpião são ferozes, provavelmente porque eles entendem muito bem as regras do universo. Alguns escorpianos podem parecer mais velhos do que realmente são. Eles são excelentes líderes, pois se dedicam muito ao que fazem. Odeiam desonestidade e podem ser muito ciumentos e desconfiados, então eles precisam aprender a adaptação a diferentes comportamentos humanos. São corajosos e, portanto, eles têm um monte de amigos.\n",
            "Curioso e energético, Sagitário é um dos maiores viajantes entre todos os signos do zodíaco. Sua mente aberta e visão filosófica os motiva a passear ao redor do mundo em busca do sentido da vida.\n" +
                    "Sagitário é extrovertido, otimista e entusiasta, e gosta de mudanças. Os nascidos em Sagitário são capazes de transformar seus pensamentos em ações concretas e fazem qualquer coisa para atingir seus objetivos.\n" +
                    "Como os outros signos de fogo, Sagitário precisa estar constantemente em contato com o mundo para experimentar o máximo possível. O planeta regente de Sagitário é Júpiter, o maior planeta do zodíaco. Seu entusiasmo não tem limites e, portanto, as pessoas nascidas sob o signo de Sagitário possuem um grande senso de humor e uma intensa curiosidade.\n" +
                    "A liberdade é o seu maior tesouro, pois só assim eles podem viajar livremente e explorar diferentes culturas e filosofias. Por causa de sua honestidade, os sagitarianos são muitas vezes impacientes e sem tato quando precisam dizer ou fazer alguma coisa, por isso é importante que aprendam a se expressar de uma forma tolerante e socialmente aceitável."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDeSignos = (ListView) findViewById(R.id.listViewID);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
        );

        listaDeSignos.setAdapter( adaptador );

        listaDeSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DetalhesDoSignoActivity.class);

                intent.putExtra("signo", signos[position]);
                intent.putExtra("detalhes", detalhesDosSignos[position]);

                startActivity( intent );
            }
        });

    }
}
