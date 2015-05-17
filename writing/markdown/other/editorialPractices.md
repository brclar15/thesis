##Chapter 3: Editorial Practices##


Throughout this thesis, I have worked in a digital environment. The task of breaking a retelling into episodes and then analyzing these respective episodes across other various retellings is not in itself inherently digital. However, this work method does allow for more precise comparisons to be made. Both my textual editions as well as certain data sets were all done in a digital format in order to make them long-lasting and easily accessible. 

Wherever possible, I have created diplomatic digital editions for my sources by working with digital open access photography. A diplomatic edition is one that seeks to represent faithfully every mark that appears on a page. The purpose of this is to provide an authentic reading of a specific manuscript. In this type of edition, words that seem to be scribal errors are transcribed exactly as they appear, although there is a way to indicate that the editor believes there to be a problem with what the scribe has written. Every accent, breathing, and diacritical mark that appears in the manuscripts is accurately reflected in my editions. This practice holds true even when these marks do not correspond to modern views of standard Greek, such as the abundance of diaereses  in the BNF 2705 manuscript of the *Homeric Allegories*[^1]. Modern corrections and rules of orthography are not imposed onto the text, thus preserving its integrity and original from. I have edited the text groups found on the Tabula completely in lower case and without proper accentuation.  My only additions are found in the TEI "supplied" elements. These additions are meant to make my editions readable, and are taken from printed editions of the Tabula, such as the Inscriptiones Graecae volume 14 and *Homer in Stone*[^2].

Additionally, a diplomatic edition that is done digitally further enhances the usefulness of the edition and improves how faithfully it represents the original. First, it offers a reader of the edition the option of several different viewing options, as opposed to the static view offered in a printed edition. Not only can the reader choose to see a purely diplomatic edition, but they also have the freedom to view the same edition with the abbreviations expanded and with other editorial choices resolved. On a more complex level, the reader can also select the order in which to view the text. For example, my editions of the Proclus' summaries from the Venetus A can be viewed in narrative order, or they can be viewed in the order in which they appear in the manuscript. This method gives the reader a better sense of how the original document is composed. 

I have done my editions in Extensible Markup Language (XML) and followed the Text Encoding Initiative (TEI) guidelines. XML allows my editions to be machine actionable and technology independent. They can be manipulated in a variety of ways and will outlast any website that I use to host them. The TEI guidelines allowed me to create diplomatic editions that match a sophisticated level of scholarship. This style of editing gave me the ability to "tag up" my text with TEI elements that indicate whether a word is a person name, place name, abbreviation, error, or a number of other categories. Rather than attempt to follow every available TEI markup, it has been my practice to adhere to the editorial guide put forth by the Homer Multitext project [^3]. This sets attainable limits on the vast scope of TEI mark up, while still providing a highly diplomatic edition and a usable digital text. 

Another benefit to digital editions is that they can link directly to the source material. Instead of merely offering my reading of the text and forcing a reader to accept my edition blindly, all of my texts are linked back to the digital photography. This way, a reader can verify my reading for themselves. As mentioned in the previous chapter, my editions were done from open access digital photography of these select manuscripts and documents. The growing trend of museums and libraries releasing open access images of manuscript lets both scholars and students make use of these primacy documents, which was previously impossible. The release of new manuscript images from the Bibliothèque nationale de France lead to both the inclusion of the hypothesis and the *Homeric Allegories* in this thesis. Without open access to these images, I would not have known about these greatly understudied sources. 

My editions for my text sources are largely straight forward. The author and work are listed at the top, and then the text is either broken up into poetic lines or other blocks of text, according to the work. However, this information is not always known for each text. For example, the hypothesis found in the BNF 2706 is simply entitled "Hypothesis of the Iliad". We do not have any more background information on this text, such as where it comes from or if it was part of a larger collection of hypotheses. The header attributing this hypothesis to Aristarchus is in a later hand than the rest of the text. Therefore, I have not included an author for this text. My editions of the Proclus' summaries are cited to the Venetus A, except for the summary of the *Cypria*, which is cited to the Omega 1.12. 

In contrast to the clear process of editing different manuscript texts, a document such as the Tabula Capitolina proved to be much more complicated editorial task. At first glance, the reader does not know where to begin. One could work through the scenes in turns of their narrative chronology, top to bottom, left to right, or a combination. Michael Squire writes that the Tabula can be seen as an ancient "pick your own adventure" book [^4]. The magic squares on the reverse side of the Tabula further support a complex and subjective reading of this document[^5]. In addition to the magic squares, Petrain also provides examples of three other works of art mentioned in classical literature that depict complex scenes[^6]. Due to the fact that an ancient reader of the Tabula would have been free to let their eyes roam freely over the stone, a digital edition is the best medium to mirror this open method of reading. In my XML edition, I have divided the texts on the tabula into separate groups, and then structured my edition based on these divisions. 

First, I began with the hexameter verse found in between the scenes of the *Iliupersis* and the *Aethiopis*[^7]. In its original state, it would have read τεχνην την θεοδωρηον μαθε ταξιν Ομηρος οφρα δαεις πασης μετρον εχης σοφιας.[^8]. This verse serves as a prefatory introduction to the entire Tabula with the direct imperative addressed to the reader. It explains what is on the stone, as well as the benefits for studying it. 

Next, I have placed the text group that gives somewhat of a table of contents or sources for this tabula. This appears in the center of the scenes of the *Iliupersis*, which would have been roughly in the center of the stone in its original form[^9]. It may be tempting to take the text citing the *Iliupersis* as a stand-alone caption for the central block of images from this epic, due to the separation caused by the ship carvings. However, I have placed both this reference as well as the problematic τρωικος[^10] with the rest of the list of titles. They form one cohesive group that provides a context within which to place the accompanying figures and texts. The attributions for each poem, particularly the *Iliupersis'* to Stesichorus[^11], suggest the highly literary sphere that this tabula belong to[^12]. Each line of text in my edition is wrapped in a TEI "ab" element, for anonymous block. These elements are meant to represent the physical layout of the stone. They allow for the text to end when the physical line on the stone ends, but then are augmented with initial and final "w", for word, elements to show that a given words spans two lines of text.

Then, I have placed the text of the stele with the prose summary of *Iliad* 7 through 24[^13]. Like the table of contents, it is sighed by TEI "ab" elements that correspond to the physical lines of the stone. Here I have extensively used TEI markup, such as the "damage", "supplied", and "unclear" elements. An edition of this text was made possible largely thanks to altered photography in order to make the characters more visible. 

Last, I have the captions that accompany the carved figures. I divided these texts in two ways. First, they are separated by which epic the scenes on which they are commenting belong. I arranged these epics in their narrative sequence, starting with the *Iliad* and ending with the *Iliupersis*. Due to the way in which the Tabula is organized, the *Iliad* division is further broken into individual books. Second, there are individual anonymous blocks within each epic according to the episodic divisions within the images. These blocks can contain more than one caption, depending on the contents of the episode. 

As I have already established, an important aspect of a digital edition is that it is not restricted to one static view, but rather offers the reader an array of choices. My division of the texts of the Tabula Capitolina is structured due to the explanation above, but can easily be read in a number of ways thanks to my digital edition. It is an improvement upon the edition done for the Inscriptiones Graecae (IG) and other print editions because of this manipulability. While an online edition of the IG[^14] does let the reader toggle supplied characters on and off, it is not a diplomatic edition. The presence of all of the book letters for the pictorial bands of *Iliad* 13 through 24 reveal that the IG supplied more than they claim to have added. 

[1]: cite example?

[2]: link to IG and Petrain chapter

[3]: http://homermultitext.github.io/hmt-editors-guide/editorial-policies/

[4]: Squire

[5]: Petrain here

[6]: Petrain Chapter 3]

[7]: urn:cite:hmt:capimgs.Capitoline_1@0.035,0.8267,0.682,0.0373

[8]: cite translation

[9]: urn:cite:hmt:capimgs.Capitoline_1@0.17,0.5213,0.264,0.316

[10]: cite why its problematic

[11]: cite why significant

[12]: cite Petrain/Squire

[13]: urn:cite:hmt:capimgs.Capitoline_1@0.61,0.0747,0.101,0.7907

[14]: http://epigraphy.packhum.org/inscriptions/main
