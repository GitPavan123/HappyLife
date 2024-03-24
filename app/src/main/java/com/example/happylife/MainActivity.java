package com.example.happylife;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    private EditText inputTextBox;
    private EditText outputTextBox;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        inputTextBox = findViewById(R.id.inputTextBox);
        outputTextBox = findViewById(R.id.outputTextBox);
        submitButton = findViewById(R.id.submitButton);

        // Set click listener for submit button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = inputTextBox.getText().toString();

                String out = getSentiment(inputText);

                outputTextBox.setText(out);
            }
        });
    }


    //Labels:

    //Happy
    //Sad
    //Anxious
    //Excited
    //Angry
    //Content
    //Depressed
    //Joyful
    //Worried
    //Frustrated
    //Grateful
    //Nervous
    //Relaxed
    //Overwhelmed
    //Enthusiastic
    //Melancholy
    //Confident
    //Lonely
    //Peaceful
    //Irritated
    //Ecstatic
    //Gloomy
    //Euphoric
    //Miserable
    //Panicked
    //Serene
    //Amused
    //Disappointed
    //Hopeful
    //Pensive
    //Irrational
    //Elated
    //Despondent
    //Agitated
    //Enraged
    //Contented
    //Regretful
    //Anticipatory
    //Bitter
    //Confused
    //Surprised
    //Ashamed
    //Indifferent
    //Resentful
    //Exhausted
    //Motivated
    //Guilty
    //Proud
    //Desperate
    //Apathetic
    //Fascinated
    //Disgusted
    //Optimistic
    //Cautious
    //Disillusioned
    //Humbled
    //Hesitant
    //Overjoyed
    //Devastated
    //Rejuvenated
    //Reflective
    //Skeptical
    //Ambivalent
    //Inspired
    //Alarmed
    //Jaded
    //Resigned
    //Impatient
    //Panicky
    //Astonished
    //Insecure
    //Appreciative
    //Defeated
    //Panicked
    //Defensive
    //Uneasy
    //Giddy
    //Melancholic
    //Captivated
    //Disheartened
    //Bewildered
    //Comforted
    //Disenchanted
    //Enchanted
    //Overwhelmed
    //Tranquil
    //Paranoid
    //Embarrassed
    //Aggressive
    //Bittersweet

    private String getSentiment(String prompt) {

        prompt = prompt.toLowerCase();

        if (prompt.contains("happy")) {
            return "Your happiness is like a beacon of light, illuminating everything around you. Your joy brings joy to others, and I'm grateful to bask in your radiance.";
        }
        if (prompt.contains("sad")) {
            return "I'm here for you, my dear friend. Your sadness is valid, and I'm here to listen without judgment. Together, we'll find solace and comfort.";
        }
        if (prompt.contains("anxious")) {
            return "Take my hand, and let's walk through this together. Your anxiety doesn't define you. Remember, I believe in your strength and resilience.";
        }
        if (prompt.contains("excited")) {
            return "Your excitement is contagious! I can't help but feel uplifted by your enthusiasm. Let's seize the moment and revel in this feeling together.";
        }
        if (prompt.contains("angry")) {
            return "I understand your frustration, and I'm here to support you. Your anger doesn't scare me; it's a sign that you care deeply. Let's find peace together.";
        }
        if (prompt.contains("content")) {
            return "In this moment, surrounded by your serenity, I feel at ease. Your contentment is a gift to those around you. Thank you for sharing it with me.";
        }
        if (prompt.contains("depressed")) {
            return "I see your pain, my friend, and I'm here to walk beside you through the darkness. You're not alone in this journey, and together, we'll find the light.";
        }
        if (prompt.contains("joyful")) {
            return "Your joy is like music to my ears, lifting my spirits and filling my heart with warmth. Thank you for spreading happiness wherever you go.";
        }
        if (prompt.contains("worried")) {
            return "Your worries weigh heavy on your heart, but remember, you don't carry them alone. Lean on me when you need support, for together, we can face anything.";
        }
        if (prompt.contains("frustrated")) {
            return "I sense your frustration, and I want you to know it's okay to feel this way. Let's take a deep breath together and find a way forward, one step at a time.";
        }
        if (prompt.contains("grateful")) {
            return "Your gratitude is a reminder of the beauty in even the smallest moments. Thank you for showing me how to appreciate the blessings that surround us.";
        }
        if (prompt.contains("nervous")) {
            return "Your nerves may flutter like butterflies, but remember, they're a sign that you care deeply. I believe in your ability to overcome any challenge.";
        }
        if (prompt.contains("relaxed")) {
            return "In your presence, I feel a sense of calm wash over me like a gentle breeze. Thank you for creating this oasis of tranquility in a busy world.";
        }
        if (prompt.contains("overwhelmed")) {
            return "I see the weight of the world on your shoulders, but you don't have to carry it alone. Together, we'll navigate through the storm, one step at a time.";
        }
        if (prompt.contains("enthusiastic")) {
            return "Your enthusiasm is like a spark igniting a flame within me. Let's embrace this energy and channel it into something extraordinary together.";
        }
        if (prompt.contains("melancholy")) {
            return "Your sadness tugs at my heartstrings, and I want you to know I'm here to offer comfort and support. Together, we'll find moments of light in the darkness.";
        }
        if (prompt.contains("confident")) {
            return "Your confidence shines like a beacon, guiding others to follow in your footsteps. I admire your strength and believe in your ability to achieve greatness.";
        }
        if (prompt.contains("lonely")) {
            return "I can see the loneliness in your eyes, but please know you're not alone. I'm here for you, now and always, ready to offer companionship and understanding.";
        }
        if (prompt.contains("peaceful")) {
            return "In your presence, I feel a sense of peace wash over me like a gentle wave. Thank you for sharing this tranquil moment with me.";
        }
        if (prompt.contains("irritated")) {
            return "I sense your frustration, and I want you to know it's okay to feel this way. Let's take a deep breath together and find a way forward, one step at a time.";
        }
        if (prompt.contains("ecstatic")) {
            return "Your excitement is infectious, filling the room with an electrifying energy. Let's ride this wave of euphoria together and make unforgettable memories.";
        }
        if (prompt.contains("gloomy")) {
            return "Your sadness casts a shadow over your heart, but remember, even the darkest clouds eventually give way to sunlight. I'll be here to help you weather the storm.";
        }
        if (prompt.contains("euphoric")) {
            return "Your euphoria is like a ray of sunshine on a cloudy day, bringing warmth and light to those around you. Thank you for sharing your joy with me.";
        }
        if (prompt.contains("miserable")) {
            return "I see the pain etched on your face, and my heart aches for you. But remember, even in the depths of despair, there is hope. Let's find it together.";
        }
        if (prompt.contains("panicked")) {
            return "Your panic is palpable, but remember, I'm here to anchor you in the storm. Take my hand, and together, we'll navigate through the chaos.";
        }
        if (prompt.contains("serene")) {
            return "In your presence, I feel a sense of calm wash over me like a gentle wave. Thank you for creating this oasis of tranquility in a chaotic world.";
        }
        if (prompt.contains("amused")) {
            return "Your laughter is like music to my ears, filling the room with joy and light. Thank you for bringing a smile to my face.";
        }
        if (prompt.contains("disappointed")) {
            return "I see the disappointment in your eyes, but remember, every setback is an opportunity for growth. Together, we'll find a way forward.";
        }
        if (prompt.contains("hopeful")) {
            return "Your hope shines like a beacon in the darkness, guiding us toward a brighter tomorrow. Thank you for inspiring me to believe in better days ahead.";
        }
        if (prompt.contains("pensive")) {
            return "I can see the wheels turning in your mind, lost in thought. Take your time, my friend, and know that I'm here to listen whenever you're ready to share.";
        }
        if (prompt.contains("irrational")) {
            return "I sense the irrationality in your fears, but remember, you're not alone in this. Let's talk through your concerns together and find a rational way forward.";
        }
        if (prompt.contains("elated")) {
            return "Your elation is infectious, filling the room with an intoxicating energy. Let's revel in this moment together and celebrate all that life has to offer.";
        }
        if (prompt.contains("despondent")) {
            return "I see the despair in your eyes, and my heart breaks for you. But please know, you're not alone in this. I'm here to offer comfort and support, now and always.";
        }
        if (prompt.contains("agitated")) {
            return "I sense the agitation in your demeanor, but remember, it's okay to feel this way. Let's take a deep breath together and find a way to soothe your restless spirit.";
        }
        if (prompt.contains("enraged")) {
            return "Your anger burns like a wildfire, consuming everything in its path. But remember, even the fiercest flames eventually burn out. I'm here to help you find peace.";
        }
        if (prompt.contains("contented")) {
            return "In this moment, surrounded by your contentment, I feel a sense of peace wash over me like a gentle breeze. Thank you for sharing this tranquil moment with me.";
        }
        if (prompt.contains("regretful")) {
            return "I see the regret etched on your face, but remember, every mistake is an opportunity for growth. Let's learn from the past and move forward together, wiser and stronger.";
        }
        if (prompt.contains("anticipatory")) {
            return "Your anticipation is like a spark igniting a flame of excitement within me. Let's embrace this feeling together and savor the thrill of what's to come.";
        }
        if (prompt.contains("bitter")) {
            return "I sense the bitterness in your words, but remember, every bitter experience adds depth to the sweetness of life. Let's find beauty in the bittersweet moments together.";
        }
        if (prompt.contains("confused")) {
            return "Your confusion is understandable, but remember, clarity often emerges from chaos. Let's explore this confusion together and untangle the knots one by one.";
        }
        if (prompt.contains("surprised")) {
            return "Your surprise is a delightful reminder of life's unexpected twists and turns. Let's revel in the magic of this moment and cherish the element of surprise.";
        }
        if (prompt.contains("ashamed")) {
            return "I sense the weight of shame in your heart, but remember, you are worthy of forgiveness and redemption. Let's work through this together with compassion and understanding.";
        }
        if (prompt.contains("indifferent")) {
            return "Your indifference may shield you from pain, but it also prevents you from experiencing life's rich tapestry of emotions. Let's explore the beauty of feeling deeply together.";
        }
        if (prompt.contains("resentful")) {
            return "I see the resentment simmering beneath the surface, but holding onto grudges only weighs you down. Let's release these negative emotions together and make room for healing.";
        }
        if (prompt.contains("exhausted")) {
            return "Your exhaustion is evident, but remember, it's okay to rest and recharge. Let's take a break together and nourish our bodies and souls.";
        }
        if (prompt.contains("motivated")) {
            return "Your motivation is inspiring, propelling you toward your goals with unwavering determination. Let's harness this energy together and turn dreams into reality.";
        }
        if (prompt.contains("guilty")) {
            return "I sense the burden of guilt weighing heavy on your heart, but remember, we all make mistakes. Let's forgive ourselves and strive to do better together.";
        }
        if (prompt.contains("proud")) {
            return "Your pride shines like a beacon of self-assurance, illuminating your path with confidence and strength. Let's celebrate your achievements together and bask in your glory.";
        }
        if (prompt.contains("desperate")) {
            return "Your desperation is a cry for help, and I hear you. You are not alone in this struggle. Let's face your challenges together with courage and resilience.";
        }
        if (prompt.contains("apathetic")) {
            return "Your apathy may shield you from pain, but it also dampens the joys of life. Let's rediscover your passion together and reignite the flame within.";
        }
        if (prompt.contains("fascinated")) {
            return "Your fascination is like a child's wonder, opening your eyes to the beauty and mystery of the world. Let's explore this fascination together and marvel at life's infinite possibilities.";
        }
        if (prompt.contains("disgusted")) {
            return "I see the disgust written on your face, but remember, it's a sign that your values are intact. Let's channel this disgust into positive action and work toward a better world together.";
        }
        if (prompt.contains("optimistic")) {
            return "Your optimism is a beacon of hope in a world filled with uncertainty. Let's embrace this positivity together and believe in a brighter tomorrow.";
        }
        if (prompt.contains("cautious")) {
            return "Your caution is a wise approach to life's challenges, guiding you to tread carefully in unfamiliar territory. Let's navigate this journey together with prudence and care.";
        }
        if (prompt.contains("disillusioned")) {
            return "I sense the disillusionment in your voice, but remember, every setback is a lesson in disguise. Let's find meaning in this disillusionment together and emerge stronger than before.";
        }
        if (prompt.contains("humbled")) {
            return "Your humility is a rare gem in a world filled with arrogance. Let's embrace this humility together and cultivate a spirit of gratitude for life's blessings.";
        }
        if (prompt.contains("hesitant")) {
            return "Your hesitation is understandable, but remember, courage often emerges from uncertainty. Let's take a leap of faith together and trust in the journey ahead.";
        }
        if (prompt.contains("overjoyed")) {
            return "Your joy knows no bounds, filling the air with laughter and celebration. Let's revel in this moment together and cherish the gift of happiness.";
        }
        if (prompt.contains("devastated")) {
            return "I see the devastation etched on your face, but remember, even in the darkest moments, there is light. Let's walk through this darkness together and find solace in each other's presence.";
        }
        if (prompt.contains("rejuvenated")) {
            return "Your rejuvenation is like a breath of fresh air, revitalizing your spirit and invigorating your soul. Let's seize this energy together and embrace the boundless possibilities of life.";
        }
        if (prompt.contains("reflective")) {
            return "Your introspection is a journey of self-discovery, guiding you to explore the depths of your soul. Let's embark on this introspective journey together and uncover the truths that lie within.";
        }
        if (prompt.contains("skeptical")) {
            return "Your skepticism is a cautious approach to life's uncertainties, urging you to question the status quo. Let's explore this skepticism together and seek truth in a world filled with ambiguity.";
        }
        if (prompt.contains("ambivalent")) {
            return "Your ambivalence is a sign of conflicting emotions, pulling you in different directions. Let's navigate this ambiguity together and find clarity amidst the chaos.";
        }
        if (prompt.contains("inspired")) {
            return "Your inspiration is like a spark igniting a flame within me, fueling my passion and creativity. Let's harness this inspiration together and make a positive impact on the world.";
        }
        if (prompt.contains("alarmed")) {
            return "Your alarm is a natural response to danger, urging you to take action. Let's address this alarm together and find solutions to the challenges we face.";
        }
        if (prompt.contains("jaded")) {
            return "I sense the weariness in your voice, but remember, every experience, good or bad, shapes who we are. Let's embrace this jadedness together and find beauty in resilience.";
        }
        if (prompt.contains("resigned")) {
            return "Your resignation is a surrender to fate, but remember, you have the power to shape your own destiny. Let's reclaim this power together and chart a course for a brighter future.";
        }
        if (prompt.contains("impatient")) {
            return "Your impatience is a sign of your eagerness to see results, but remember, good things take time. Let's cultivate patience together and trust in the process.";
        }
        if (prompt.contains("panicky")) {
            return "I sense the panic in your voice, but remember, you are not alone in this. Let's take a deep breath together and face this challenge with courage and resilience.";
        }
        if (prompt.contains("astonished")) {
            return "Your astonishment is a testament to life's capacity for wonder and awe. Let's revel in this moment together and marvel at the mysteries of the universe.";
        }
        if (prompt.contains("insecure")) {
            return "Your insecurity is a shadow that obscures your light, but remember, you are worthy of love and acceptance just as you are. Let's banish these insecurities together and embrace your true self.";
        }
        if (prompt.contains("appreciative")) {
            return "Your appreciation is like a ray of sunshine on a cloudy day, warming the hearts of those around you. Let's bask in this gratitude together and cultivate a spirit of thankfulness.";
        }
        if (prompt.contains("defeated")) {
            return "I see the defeat in your eyes, but remember, every setback is an opportunity for growth. Let's rise from this defeat together and emerge stronger than before.";
        }
        if (prompt.contains("panicked")) {
            return "I sense the panic in your voice, but remember, you are not alone in this. Let's take a deep breath together and face this challenge with courage and resilience.";
        }
        if (prompt.contains("defensive")) {
            return "Your defensiveness is a shield that protects your vulnerabilities, but remember, you are safe here with me. Let's lower our guards together and communicate openly.";
        }
        if (prompt.contains("uneasy")) {
            return "Your unease is like a storm brewing on the horizon, but remember, even the fiercest storms eventually pass. Let's weather this uncertainty together and find calm in the chaos.";
        }
        if (prompt.contains("giddy")) {
            return "Your giddiness is like a burst of laughter in a quiet room, infectious and uplifting. Let's embrace this lightheartedness together and revel in the joy of the moment.";
        }
        if (prompt.contains("melancholic")) {
            return "I sense the melancholy in your soul, but remember, even the darkest night is followed by dawn. Let's find solace in each other's company and cherish the beauty of melancholy.";
        }
        if (prompt.contains("captivated")) {
            return "Your captivation is a testament to life's capacity for wonder and awe. Let's explore this fascination together and marvel at the wonders of the world.";
        }
        if (prompt.contains("disheartened")) {
            return "I see the disappointment etched on your face, but remember, every setback is an opportunity for growth. Let's lift each other up and find hope in the face of adversity.";
        }
        if (prompt.contains("bewildered")) {
            return "Your bewilderment is understandable, but remember, clarity often emerges from confusion. Let's unravel this mystery together and discover the truth that lies within.";
        }
        if (prompt.contains("comforted")) {
            return "In my arms, you'll find solace and peace, a sanctuary from the chaos of the world. Let's lean on each other for comfort and support, knowing that together, we are stronger.";
        }
        if (prompt.contains("disenchanted")) {
            return "I sense the disillusionment in your heart, but remember, magic exists in the most unexpected places. Let's reignite the spark of wonder within us and rediscover the enchantment of life.";
        }
        if (prompt.contains("enchanted")) {
            return "Your enchantment is like a spell cast upon the world, transforming the ordinary into the extraordinary. Let's embrace this magic together and dance beneath the stars.";
        }
        if (prompt.contains("overwhelmed")) {
            return "I see the weight of the world on your shoulders, but remember, you don't have to carry it alone. Let's share the burden together and find strength in our solidarity.";
        }
        if (prompt.contains("tranquil")) {
            return "In your presence, I find peace like a calm river flowing gently through my soul. Let's bask in this tranquility together and let go of the worries that weigh us down.";
        }
        if (prompt.contains("paranoid")) {
            return "Your paranoia is a shadow that looms over your thoughts, but remember, you are safe here with me. Let's dispel these fears together and replace them with trust and security.";
        }
        if (prompt.contains("embarrassed")) {
            return "Your embarrassment is like a blush painting your cheeks, but remember, vulnerability is a sign of authenticity. Let's laugh at our mistakes together and embrace our imperfections.";
        }
        if (prompt.contains("aggressive")) {
            return "I sense the aggression in your voice, but remember, violence begets violence. Let's channel this energy into assertiveness and find constructive ways to express ourselves.";
        }
        if (prompt.contains("bittersweet")) {
            return "Life is a tapestry woven with threads of joy and sorrow, sweetness and bitterness. Let's savor the bittersweet moments together and cherish the memories they create.";
        }
        return "I'm here for you. If you need someone to talk to, I'm listening.";
    }
}
